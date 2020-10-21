package nhbank.core.controllers;

import lombok.extern.log4j.Log4j;
import nhbank.core.config.Config;
import nhbank.core.services.ACOM_LMT_BASEHISInfoService;

import nhbank.core.util.GenerateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.List;
import java.util.Map;


@Log4j
@CrossOrigin("*")
@RestController
@RequestMapping("/nhbank")

public class NHBankController {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    private Config config;


    @Autowired
    private ACOM_LMT_BASEHISInfoService acom_lmt_basehisInfoService;

    @Autowired

    @GetMapping(value = "/test")
    public ResponseEntity<?> testAPI() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<?> addIdFile() throws IOException {
        List<String> sqlFile = config.getSql();
        //Creating a File object for directory
        File directoryPath = new File("E:/NHBANK_TARGET/NH_BANK/");
        //List of all files and directories
        File[] filesList = directoryPath.listFiles();
        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFile.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            Map<Integer, String> primaryKeyMap = GenerateUtils.findPrimaryKeys(file);
            GenerateUtils.buildDomainsID(file.getName(), primaryKeyMap);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/convert")
    public ResponseEntity<?> parsingFile() {
        List<String> sqlFiles = config.getSql();
        //Creating a File object for directory
        File directoryPath = new File("E:\\NHBANK_TARGET\\NH_BANK");
        //List of all files and directories
        File[] filesList = directoryPath.listFiles();
        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFiles.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            Map<Integer, String> listFields = GenerateUtils.convertFileToObject(file);
            GenerateUtils.buildModel(file.getName(), listFields);
//            GenerateUtils.buildDomain(file.getName(), listFields);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/update")
    public ResponseEntity<?> updateDB() {
        acom_lmt_basehisInfoService.updateAll();
        return new ResponseEntity<>("Update Successfully!", HttpStatus.OK);
    }

    @GetMapping(value = "service")
    public ResponseEntity<?> mappingData() {
        List<String> sqlFile = config.getSql();
        //Creating a File object for directory
        File directoryPath = new File("E:/NHBANK_TARGET/NH_BANK/");
        //List of all files and directories
        File[] filesList = directoryPath.listFiles();

        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFile.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            Map<Integer, String> listFields = GenerateUtils.convertFileToObject(file);
            Map<Integer, String> primaryKeyMap = GenerateUtils.findPrimaryKeys(file);
            GenerateUtils.buildDataMapping(file.getName(), listFields, primaryKeyMap);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }


}
