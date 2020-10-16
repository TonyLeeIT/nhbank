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
import java.math.BigDecimal;
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
    private ResponseEntity<List<ACOM_LMT_BASEHISInfo>> readObjectFromTxt() {
        List<ACOM_LMT_BASEHISInfo> objList = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("E:/ACOM_LMT_BASEHIS.txt"));

            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_BASEHISInfo obj = new ACOM_LMT_BASEHISInfo();
                obj.setSngNo(lineArray[0]);
                obj.setActCd(lineArray[1]);
                obj.setHisNo(Integer.parseInt(lineArray[2]));
                obj.setHisGb(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setAcIl((lineArray[6].equals("")) ? null :formatter.parse(lineArray[6]));
                obj.setGisIl((lineArray[7].equals("")) ? null :formatter.parse(lineArray[7]));
                obj.setCanIl((lineArray[8].equals("")) ? null :formatter.parse(lineArray[8]));
                obj.setExpIl((lineArray[18].equals("")) ? null :formatter.parse(lineArray[18]));
                obj.setSngIl((lineArray[19].equals("")) ? null :formatter.parse(lineArray[19]));
                obj.setSilLstil((lineArray[34].equals("")) ? null :formatter.parse(lineArray[34]));
                obj.setIsIl((lineArray[48].equals("")) ? null :formatter.parse(lineArray[48]));
                obj.setIkIl((lineArray[52].equals("")) ? null :formatter.parse(lineArray[52]));
                obj.setLstIbil((lineArray[55].equals("")) ? null :formatter.parse(lineArray[55]));
                obj.setRegDt((lineArray[79].equals("")) ? null :formatter.parse(lineArray[79]));
                obj.setUpdDt((lineArray[82].equals("")) ? null :formatter.parse(lineArray[82]));

                obj.setMngBr(lineArray[9]);
                obj.setCixNo(lineArray[10]);
                obj.setSngSts(lineArray[11]);
                obj.setSngInfo(lineArray[12]);
                obj.setSisSngno(lineArray[13]);
                obj.setPogwlGb(lineArray[14]);
                obj.setRevolGb(lineArray[15]);
                obj.setGihanGb(lineArray[16]);
                obj.setExpMm(Integer.parseInt(lineArray[17]));

                obj.setSngCcy(lineArray[20]);
                obj.setSngAmt(new BigDecimal(lineArray[21]));
                obj.setSngAbtrt(Integer.parseInt(lineArray[22]));
                obj.setSngAbtamt(Integer.parseInt(lineArray[23]));
                obj.setActAmt(Integer.parseInt(lineArray[24]));
                obj.setActRtgb(lineArray[25]);
                obj.setActRate(Integer.parseInt(lineArray[26]));
                obj.setActSprd(Integer.parseInt(lineArray[27]));
                obj.setActRtjo(lineArray[28]);
                obj.setSilCnt(Integer.parseInt(lineArray[29]));
                obj.setSilJanamt(new BigDecimal(lineArray[30]));
                obj.setSilAccum(Integer.parseInt(lineArray[31]));
                obj.setSilWoijan(Integer.parseInt(lineArray[32]));
                obj.setSilDjgjan(Integer.parseInt(lineArray[33]));

                obj.setBojBcnt(Integer.parseInt(lineArray[35]));
                obj.setBojBjan(Integer.parseInt(lineArray[36]));
                obj.setBojFcnt(Integer.parseInt(lineArray[37]));
                obj.setBojFjan(Integer.parseInt(lineArray[38]));
                obj.setWoiYongdo(Integer.parseInt(lineArray[39]));
                obj.setWoiSunhu(lineArray[40]);
                obj.setWoiInttrm(Integer.parseInt(lineArray[41]));
                obj.setWoiGaetrm(Integer.parseInt(lineArray[42]));
                obj.setWoiSutgb(lineArray[43]);
                obj.setSngCond(lineArray[44]);
                obj.setIsSngno(lineArray[45]);
                obj.setIsCixno(lineArray[46]);
                obj.setIsBrno(lineArray[47]);

                obj.setIkSngno(lineArray[49]);
                obj.setIkCixno(lineArray[50]);
                obj.setIkBrno(lineArray[51]);
                obj.setSngAplseq(Integer.parseInt(lineArray[53]));
                obj.setSngAuth(lineArray[54]);

                obj.setSngBrno(lineArray[56]);
                obj.setSngClerk(lineArray[57]);
                obj.setSngAstmgr(lineArray[58]);
                obj.setSngLonmgr(lineArray[59]);
                obj.setSngChajang(lineArray[60]);
                obj.setSngJumjang(lineArray[61]);
                obj.setBojMjAmt(Integer.parseInt(lineArray[62]));
                obj.setRateGb(lineArray[63]);
                obj.setRateJugi(lineArray[64]);
                obj.setSpread(new BigDecimal(lineArray[65]));
                obj.setYoncheRate(new BigDecimal(lineArray[66]));
                obj.setGraceDay(Integer.parseInt(lineArray[67]));
                obj.setDayCntBasis(lineArray[68]);
                obj.setBusiDayRule(lineArray[69]);
                obj.setPenalRate(Integer.parseInt(lineArray[70]));
                obj.setTrBr(lineArray[71]);
                obj.setSdBr(lineArray[72]);
                obj.setTrTime(lineArray[73]);
                obj.setOpNo(lineArray[74]);
                obj.setMngNo(lineArray[75]);
                obj.setAgreeNo(lineArray[76]);
                obj.setCondSts(lineArray[77]);
                obj.setRegEmpNo(lineArray[78]);

                obj.setRegTm(lineArray[80]);
                obj.setRegEmpNo(lineArray[81]);

                obj.setUpdTm(lineArray[83]);
                objList.add(obj);
            }
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
        return new ResponseEntity<List<ACOM_LMT_BASEHISInfo>>(objList, HttpStatus.OK);
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
