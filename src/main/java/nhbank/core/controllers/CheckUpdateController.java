package nhbank.core.controllers;


import nhbank.core.domain.CheckUpdate;

import nhbank.core.services.CheckUpdateService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.Optional;


@RestController

@CrossOrigin("*")
public class CheckUpdateController {
    @Autowired
    CheckUpdateService checkUpdateService;

    @GetMapping("/CheckUpdate")
    public ResponseEntity<Page<CheckUpdate>> getObjList(@RequestParam(required = false, name = "filter") String filter,
                                                        @RequestParam(required = false, name = "range") String range,
                                                        @RequestParam(required = false, name = "sort") String sort) {
        //handling filter request param
        String keyWord = null;
        if (!filter.equals("{}")) {
            String filterString = filter.substring(filter.indexOf("\"") + 1, filter.lastIndexOf("\""));
            String[] filterStringArray = filterString.split("\":\"");
            keyWord = filterStringArray[1];
        }
        //handling range request param
        String rangeString = range.substring(range.indexOf("[") + 1, range.indexOf("]"));
        String[] rangeStringArray = rangeString.split(",");
        int[] rangeIntArray = Arrays.stream(rangeStringArray).mapToInt(Integer::parseInt).toArray();
        int startValue = rangeIntArray[0];
        int endValue = rangeIntArray[1];
        int size = (endValue - startValue) + 1;
        int page = Math.max((endValue / (size - 1)) - 1, 0);

        //handling sort request param
        String sortString = sort.substring(sort.indexOf("\"") + 1, sort.lastIndexOf("\""));
        String[] sortStringArray = sortString.replace('\"', ',').split(",,,");
        String propertyName = sortStringArray[0];
        String sortMethod = sortStringArray[1];

        Page<CheckUpdate> objList = null;
        Pageable pageableASC = PageRequest.of(page, size, Sort.by(Sort.Order.asc(propertyName)));
        Pageable pageableDESC = PageRequest.of(page, size, Sort.by(Sort.Order.desc(propertyName)));

        switch (sortMethod) {
            case "ASC":
                objList = keyWord==null?checkUpdateService.findAll(pageableASC):checkUpdateService.findAllByTableName(keyWord,pageableASC);
                break;
            case "DESC":
                objList = keyWord==null?checkUpdateService.findAll(pageableDESC):checkUpdateService.findAllByTableName(keyWord,pageableDESC);
                break;
            default:
                break;
        }


        return new ResponseEntity<>(objList, HttpStatus.OK);
    }

    @GetMapping("/CheckUpdate/{id}")
    public ResponseEntity<CheckUpdate> getObjById(@PathVariable Long id) {
        Optional<CheckUpdate> checkUpdateOptional = checkUpdateService.findById(id);
        return checkUpdateOptional.map(checkUpdate -> new ResponseEntity<>(checkUpdate, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/CheckUpdate")
    public void saveObj(@RequestBody CheckUpdate checkupdate) {
        checkUpdateService.save(checkupdate);
    }

    @DeleteMapping("/CheckUpdate")
    public ResponseEntity<CheckUpdate> deleteManyObj(@RequestParam(required = false, name = "filter") String filter) {
        String idString = filter.substring(filter.indexOf("[") + 1, filter.indexOf("]"));
        String[] idStringArray = idString.split(",");
        long[] idArray = Arrays.stream(idStringArray).mapToLong(Long::parseLong).toArray();
        for (Long id : idArray) {
            checkUpdateService.delete(id);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/CheckUpdate/{id}")
    public ResponseEntity<CheckUpdate> deleteObj(@PathVariable("id") Long id) {
        Optional<CheckUpdate> checkUpdateOptional = checkUpdateService.findById(id);
        if (checkUpdateOptional.isPresent()) {
            checkUpdateService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/CheckUpdate/{id}")
    public ResponseEntity<CheckUpdate> updateObj(@PathVariable Long id, @RequestBody CheckUpdate checkupdate) {
        Optional<CheckUpdate> optionalCheckUpdate = checkUpdateService.findById(id);
        if (!optionalCheckUpdate.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            checkupdate.setTableName(checkupdate.getTableName());
            checkupdate.setUpdateTime(checkupdate.getUpdateTime());
            checkupdate.setStatus(checkupdate.getStatus());
            checkUpdateService.save(checkupdate);
            return new ResponseEntity<>(checkupdate, HttpStatus.OK);
        }
    }
}
