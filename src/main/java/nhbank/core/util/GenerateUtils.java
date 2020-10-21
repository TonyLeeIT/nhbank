package nhbank.core.util;

import nhbank.core.constant.Constant;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GenerateUtils {

    public static void buildMapping(String fileName, Map<Integer, String> listFields) {
        String sFileName = fileName.replace(".sql", "");

    }

    public static void buildDomain(String fileName, Map<Integer, String> listFields) {
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
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("@Entity \n");
            outStream.writeBytes("@Table(name = \"" + convertCamelCase(sFileName) + "\") \n");
            outStream.writeBytes("@Data \n");
            outStream.writeBytes("public class " + sFileName + "Info implements Serializable { \n");
            outStream.writeBytes("@Id \n");
            outStream.writeBytes("@GeneratedValue \n");
            listFields.forEach((k, v) -> {
                System.out.println(k + "----" + v);
                String val = v.substring(0, v.indexOf("|"));
                String type = v.substring(v.indexOf("|") + 1);
                switch (type) {
                    case Constant.TBL_VARCHAR:
                        try {
                            String key = convertCamelCase(val);
                            outStream.writeBytes("private String " + key + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            String key = convertCamelCase(val);
                            outStream.writeBytes("private BigDecimal " + key + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            String key = convertCamelCase(val);
                            outStream.writeBytes("private Date " + key + "; \n");
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

    public static void buildModel(String fileName, Map<Integer, String> listFields) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("C:\\NHBANK_TARGET\\" + fileName.replace(".sql", "") + "_DTO.java");
            target.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.model; \n");
            outStream.writeBytes("import lombok.Data; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("@Data \n");
            outStream.writeBytes("public class " + sFileName + "_DTO { \n");
            listFields.forEach((k, v) -> {
                System.out.println(k + "----" + v);
                String val = v.substring(0, v.indexOf("|"));
                String type = v.substring(v.indexOf("|") + 1);
                switch (type) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("private String " + val + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("private BigDecimal " + val + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("private Date " + val + "; \n");
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

    public static Map<Integer, String> convertFiletoObject(File file) {
        Map<Integer, String> field = new HashMap<>();
        try {
            int i = 0;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String key = "";
                if (currentLine.contains("GRANT UPDATE")) {
                    break;
                }
                if (currentLine.contains(Constant.TBL_VARCHAR)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_VARCHAR)).trim();
                    field.put(i, key + "|" + Constant.TBL_VARCHAR);
                }
                if (currentLine.contains(Constant.TBL_NUMBER)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_NUMBER)).trim();
                    field.put(i, key + "|" + Constant.TBL_NUMBER);
                }
                if (currentLine.contains(Constant.TBL_DATE)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE)).trim();
                    field.put(i, key + "|" + Constant.TBL_DATE);
                }
                if (currentLine.contains(Constant.TBL_DATE_NOT_NULL)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE_NOT_NULL)).trim();
                    field.put(i, key + "|" + Constant.TBL_DATE);
                }
                currentLine = reader.readLine();
                i++;
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return field;
    }

    static String convertCamelCase(String s) {
        return toCamelCase(s).substring(0, 1).toLowerCase() +
                toCamelCase(s).substring(1);
    }

    static String toCamelCase(String s) {
        String[] parts = s.split("_");
        String camelCaseString = "";
        for (String part : parts) {
            camelCaseString = camelCaseString + toProperCase(part);
        }
        return camelCaseString;
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
