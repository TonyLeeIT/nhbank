package nhbank.core.controllers;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo_ID;
import nhbank.core.domain.Demo;
import nhbank.core.services.ACOM_LMT_BASEHISInfoService;
import nhbank.core.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RestController

@CrossOrigin("*")
public class DemoController {
    @Autowired
    DemoService demoService;
    @GetMapping("/demo")
    public ResponseEntity<List<Demo>> getObjList(@RequestParam(required = false,name = "page") String page ,@RequestParam(required = false,name ="size") String size,@RequestParam(required = false,name ="sort") String sort){
        List<Demo> objList = demoService.findAll();
        return new ResponseEntity<>(objList, HttpStatus.OK);
    }
    @GetMapping("/demo/{id}")
    public ResponseEntity<Demo> getObjById(@PathVariable Long id){
        Optional<Demo> demoOptional = demoService.findById(id);
        return demoOptional.map(demo -> new ResponseEntity<>(demo, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/demo")
    public void saveObj(@RequestBody Demo demo){
        demoService.save(demo);
    }
    @DeleteMapping("/demo")
    public void deleteObj(@RequestParam(required = false, name = "filter")String filter){
        String idString = filter.substring(filter.indexOf("[")+1,filter.indexOf("]"));
        String[] idStringArray = idString.split(",");
        long[] idArray = Arrays.stream(idStringArray).mapToLong(Long::parseLong).toArray();
        for(Long id : idArray){
            demoService.delete(id);
        }
    }
    @PutMapping("/demo/{id}")
    public ResponseEntity<Demo> updateObj(@PathVariable Long id, @RequestBody Demo demo){
        Optional<Demo> optionalDemo = demoService.findById(id);
        if (!optionalDemo.isPresent()) {
            return new ResponseEntity<Demo>(HttpStatus.NOT_FOUND);
        } else {
            demo.setName(demo.getName());
            demo.setDob(demo.getDob());
            demoService.save(demo);
            return new ResponseEntity<Demo>(demo, HttpStatus.OK);
        }
    }
}
