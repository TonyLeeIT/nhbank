package nhbank.core.controllers;

import lombok.extern.log4j.Log4j;
import nhbank.core.config.Config;
import nhbank.core.services.BackupService;
import nhbank.core.util.GenerateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.List;
import java.util.Map;


@Log4j
@Controller
@RequestMapping("/nhbank")
@Validated
public class NHBankController {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    private Config config;
    @Autowired
    private BackupService ht002Service;

    @GetMapping(value = "/test")
    public ResponseEntity<?> testAPI() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/convert")
    public ResponseEntity<?> parsingFile() {
        List<String> sqlFiles = config.getSql();
        //Creating a File object for directory
        File directoryPath = new File("C:\\NHBANK");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();
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
            Map<Integer, String> listFields = GenerateUtils.convertFiletoObject(file);
            GenerateUtils.buildModel(file.getName(), listFields);
            GenerateUtils.buildDomain(file.getName(), listFields);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
