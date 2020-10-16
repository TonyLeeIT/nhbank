package nhbank.core.controllers;

import lombok.extern.log4j.Log4j;
import nhbank.core.config.Config;
import nhbank.core.constant.Constant;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
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

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
            Map<Integer, String> listFields = GenerateUtils.convertFiletoObject(file);
            GenerateUtils.buildModel(file.getName(), listFields);
            GenerateUtils.buildDomain(file.getName(), listFields);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @GetMapping("/read")
    private ResponseEntity<List<ACOM_LMT_BASEHISInfo>> readObjectFromTxt(){
        List<ACOM_LMT_BASEHISInfo> objList = new ArrayList<>();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy/MM/dd");
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("E:/ACOM_LMT_BASEHIS.txt"));
            ACOM_LMT_BASEHISInfo obj = new ACOM_LMT_BASEHISInfo();
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                obj.setSNG_NO(lineArray[0]);
                obj.setACT_CD(lineArray[1]);
                obj.setHIS_NO(Integer.parseInt(lineArray[2]));
                obj.setHIS_GB(lineArray[3]);
                obj.setTR_CD(lineArray[4]);
                obj.setIB_IL(formatter.parse(lineArray[5]));
                obj.setAC_IL(formatter.parse(lineArray[6]));
                obj.setGIS_IL(formatter.parse(lineArray[7]));
                obj.setCAN_IL(formatter.parse(lineArray[8]));
                obj.setMNG_BR(lineArray[9]);
                obj.setCIX_NO(lineArray[10]);
                obj.setSNG_STS(lineArray[11]);
                obj.setSNG_INFO(lineArray[12]);
                obj.setSIS_SNGNO(lineArray[13]);
                obj.setPOGWL_GB(lineArray[14]);
                obj.setREVOL_GB(lineArray[15]);
                obj.setGIHAN_GB(lineArray[16]);
                obj.setEXP_MM(Integer.parseInt(lineArray[17]));
                obj.setEXP_IL(formatter.parse(lineArray[18]));
                obj.setSNG_IL(formatter.parse(lineArray[19]));
                obj.setSNG_CCY(lineArray[20]);
                obj.setSNG_AMT(Integer.parseInt(lineArray[21]));
                obj.setSNG_ABTRT(Integer.parseInt(lineArray[17]));
                obj.setSNG_ABTAMT(Integer.parseInt(lineArray[23]));
                obj.setACT_AMT(Integer.parseInt(lineArray[24]));
                obj.setSNG_COND(lineArray[25]);
                obj.setACT_RTGB(lineArray[26]);
                obj.setACT_RATE(Integer.parseInt(lineArray[27]));
                obj.setACT_SPRD(Integer.parseInt(lineArray[28]));
                obj.setACT_RTJO(lineArray[29]);
                obj.setSIL_CNT(Integer.parseInt(lineArray[30]));
                obj.setSIL_JANAMT(Integer.parseInt(lineArray[31]));
                obj.setBUSI_DAY_RULE(lineArray[34]);
                obj.setTR_TIME(lineArray[35]);
                obj.setAGREE_NO(lineArray[36]);
                obj.setREVOL_GB(lineArray[37]);
                obj.setMNG_BR(lineArray[38]);
                obj.setDAY_CNT_BASIS(lineArray[39]);
                obj.setWOI_YONGDO(Integer.parseInt(lineArray[40]));
                obj.setHIS_GB(lineArray[41]);
                obj.setIK_IL(formatter.parse(lineArray[42]));
                obj.setSNG_STS(lineArray[43]);
                obj.setIK_SNGNO(lineArray[44]);
                obj.setACT_AMT(Integer.parseInt(lineArray[45]));
                obj.setSD_BR(lineArray[46]);
                obj.setWOI_SUNHU(lineArray[47]);
                obj.setBOJ_MJ_AMT(Integer.parseInt(lineArray[48]));
                obj.setSIL_CNT(Integer.parseInt(lineArray[49]));
                obj.setAC_IL(formatter.parse(lineArray[50]));
                obj.setWOI_INTTRM(Integer.parseInt(lineArray[51]));
                obj.setRATE_JUGI(lineArray[52]);
                obj.setIS_CIXNO(lineArray[53]);
                obj.setSNG_CCY(lineArray[54]);
                obj.setSIS_SNGNO(lineArray[55]);
                obj.setSNG_ABTRT(Integer.parseInt(lineArray[56]));
                obj.setACT_SPRD(Integer.parseInt(lineArray[57]));
                obj.setSNG_CHAJANG(lineArray[58]);
                obj.setSPREAD(Integer.parseInt(lineArray[59]));
                obj.setPENAL_RATE(Integer.parseInt(lineArray[60]));
                obj.setPOGWL_GB(lineArray[61]);
                obj.setREG_DT(formatter.parse(lineArray[62]));
                obj.setSIL_JANAMT(Integer.parseInt(lineArray[63]));
                obj.setYONCHE_RATE(Integer.parseInt(lineArray[64]));
                obj.setSNG_AMT(Integer.parseInt(lineArray[65]));
                obj.setCIX_NO(lineArray[66]);
                obj.setACT_RTGB(lineArray[67]);
                obj.setSNG_INFO(lineArray[68]);
                obj.setBOJ_BJAN(Integer.parseInt(lineArray[69]));
                obj.setBOJ_FJAN(Integer.parseInt(lineArray[70]));
                obj.setRATE_GB(lineArray[71]);
                obj.setIK_BRNO(lineArray[72]);
                obj.setIS_IL(formatter.parse(lineArray[73]));
                obj.setSIL_LSTIL(formatter.parse(lineArray[74]));
                obj.setSNG_APLSEQ(Integer.parseInt(lineArray[75]));
                obj.setGIHAN_GB(lineArray[76]);
                obj.setTR_BR(lineArray[77]);
                obj.setSNG_IL(formatter.parse(lineArray[78]));
                obj.setSNG_LONMGR(lineArray[79]);
                obj.setLST_IBIL(formatter.parse(lineArray[80]));
                obj.setUPD_TM(lineArray[81]);
                obj.setSIL_ACCUM(Integer.parseInt(lineArray[82]));
                obj.setREG_TM(lineArray[83]);
            }
            objList.add(obj);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return new ResponseEntity<List<ACOM_LMT_BASEHISInfo>>(objList,HttpStatus.OK);
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
