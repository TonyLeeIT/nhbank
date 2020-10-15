package nhbank.core.controllers;

import lombok.extern.log4j.Log4j;
import nhbank.core.config.Config;
import nhbank.core.constant.Constant;
import nhbank.core.services.BackupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import java.util.HashMap;
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
            Map<String, String> listFields = convertFiletoObject(file);
            buildModel(file.getName(), listFields);
            buildDomain(file.getName(), listFields);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    private void buildDomain(String fileName, Map<String, String> listFields) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("C:\\NHBANK_TARGET\\INFO\\" + fileName.replace(".sql", "") + "Info.java");
            target.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.domain; \n");
            outStream.writeBytes("import lombok.Data; \n");
            outStream.writeBytes("import javax.persistence.Entity; \n");
            outStream.writeBytes("import javax.persistence.GeneratedValue; \n");
            outStream.writeBytes("import javax.persistence.Id; \n");
            outStream.writeBytes("import javax.persistence.Table; \n");
            outStream.writeBytes("import java.io.Serializable; \n");
            outStream.writeBytes("import java.sql.Date; \n");
            outStream.writeBytes("@Entity \n");
            outStream.writeBytes("@Table(name = \"" + sFileName + "\") \n");
            outStream.writeBytes("@Data \n");
            outStream.writeBytes("public class " + sFileName + "Info implements Serializable { \n");
            outStream.writeBytes("@Id \n");
            outStream.writeBytes("@GeneratedValue \n");
            listFields.forEach((k, v) -> {
                System.out.println(k + "----" + v);
                switch (v) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("private String " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("private int " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("private Date " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            });
            outStream.writeBytes("} \n");
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildModel(String fileName, Map<String, String> listFields) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("C:\\NHBANK_TARGET\\" + fileName.replace(".sql", "") + "_DTO.java");
            target.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.model; \n");
            outStream.writeBytes("import lombok.Data; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("@Data \n");
            outStream.writeBytes("public class " + sFileName + "_DTO { \n");
            listFields.forEach((k, v) -> {
                System.out.println(k + "----" + v);
                switch (v) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("private String " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("private int " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("private Date " + k + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    default:
                        break;
                }
            });
            outStream.writeBytes("\n");
            outStream.writeBytes("public " + sFileName + "_DTO() { \n");
            outStream.writeBytes("} \n");
            outStream.writeBytes("} \n");
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> convertFiletoObject(File file) {
        Map<String, String> field = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String key = "";
                if (currentLine.contains("GRANT UPDATE")) {
                    break;
                }
                if (currentLine.contains(Constant.TBL_VARCHAR)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_VARCHAR)).trim();
                    field.put(key, Constant.TBL_VARCHAR);
                }
                if (currentLine.contains(Constant.TBL_NUMBER)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_NUMBER)).trim();
                    field.put(key, Constant.TBL_NUMBER);
                }
                if (currentLine.contains(Constant.TBL_DATE)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE)).trim();
                    field.put(key, Constant.TBL_DATE);
                }
                if (currentLine.contains(Constant.TBL_DATE_NOT_NULL)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE_NOT_NULL)).trim();
                    field.put(key, Constant.TBL_DATE);
                }
                currentLine = reader.readLine();
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return field;
    }

}
