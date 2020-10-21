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
        System.out.println(filesList.length);
        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFile.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            Map<Integer, String> listFields = GenerateUtils.findPrimaryKeys(file);
            GenerateUtils.buildDomainsID(file.getName(), listFields);
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
        System.out.println("List of files and directories in the specified directory:");
        for (File file : filesList) {
            if (!file.getName().endsWith(".sql")) {
                continue;
            }
            if (!sqlFiles.contains(file.getName().replace(".sql", ""))) {
                continue;
            }
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
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

//    @PostMapping("/save")
//    private void saveObjectList() {
//        List<ACOM_LMT_BASEHISInfo> objectList = readObjectFromTxt().getBody();
//        acom_lmt_basehisInfoService.saveAll(objectList);
//    }


}
