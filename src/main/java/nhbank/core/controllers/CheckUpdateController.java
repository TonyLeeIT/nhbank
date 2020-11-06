package nhbank.core.controllers;


import javafx.util.Pair;
import nhbank.core.domain.CheckUpdate;

import nhbank.core.services.CheckUpdateService;
import nhbank.core.util.HandleParams;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

        String keyWord = null;
        if (!filter.equals("{}")) {
            keyWord = HandleParams.handleFilter(filter);
        }

        Pair<Integer, Integer> rangePair = HandleParams.handleRange(range);
        int page = rangePair.getKey();
        int size = rangePair.getValue();

        Pair<String,String> sortPair = HandleParams.handleSort(sort);
        String propertyName = sortPair.getKey();
        String sortMethod = sortPair.getValue();

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
        long[] idArray = HandleParams.handleIdFilter(filter);
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
