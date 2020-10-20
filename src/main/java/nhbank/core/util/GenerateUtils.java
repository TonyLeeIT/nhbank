package nhbank.core.util;

import nhbank.core.constant.Constant;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GenerateUtils {

    public static void buildDomain(String fileName, Map<String, String> listFields) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("E:\\NHBANK_TARGET\\INFO\\" + fileName.replace(".sql", "") + "Info.java");
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

    public static void buildDomainsID(String fileName, Map<String, String> listFields) throws IOException {
        String sFileName = fileName.replace(".sql", "");

        try {
            File target = new File("E:\\NHBANK_TARGET\\ID\\" + fileName.replace(".sql", "") + "Info_ID.java");
            target.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(target);
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
            dataOutputStream.writeBytes("package nhbank.core.domain; \n");
            dataOutputStream.writeBytes(" \n");
            dataOutputStream.writeBytes("import lombok.Data; \n");
            dataOutputStream.writeBytes("import java.io.Serializable; \n");
            dataOutputStream.writeBytes("import java.math.BigDecimal; \n");
            dataOutputStream.writeBytes("import java.util.Date; \n");
            dataOutputStream.writeBytes(" \n");
            dataOutputStream.writeBytes("@Data \n");
            dataOutputStream.writeBytes("public class " + sFileName + "Info_ID implements Serializable { \n");
            listFields.forEach((k, v) -> {
                String type = v.substring(v.indexOf("|") + 1);
                switch (type) {
                    case Constant.TBL_VARCHAR:
                        try {
                            String key = convertCamelCase(k);
                            dataOutputStream.writeBytes("private String " + key + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            String key = convertCamelCase(k);
                            dataOutputStream.writeBytes("private BigDecimal " + key + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            String key = convertCamelCase(k);
                            dataOutputStream.writeBytes("private Date " + key + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            });
            dataOutputStream.writeBytes("} \n");
            dataOutputStream.close();

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void buildModel(String fileName, Map<String, String> listFields) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("E:\\NHBANK_TARGET\\" + fileName.replace(".sql", "") + "_DTO.java");
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

    public static Map<String, String> findPrimaryKeys(File file) {
        Map<String, String> primaryKeysMap = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            String[] primaryKeyArray = new String[]{};
            while (currentLine != null) {
                String primaryKey = "";
                if (currentLine.contains("GRANT UPDATE")) {
                    break;
                }
                if (currentLine.contains("ADD CONSTRAINT")) {
                    primaryKey = currentLine.substring(currentLine.indexOf("(") + 1, currentLine.indexOf(")")).trim();
                    primaryKeyArray = primaryKey.split(",");
                }
                currentLine = reader.readLine();

            }
            for (String s : primaryKeyArray) {
                if (convertFileToObject(file).containsKey(s)) {
                    primaryKeysMap.put(s, convertFileToObject(file).get(s));
                }
                System.out.println(primaryKeysMap.entrySet());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return primaryKeysMap;
    }

    public static Map<String, String> convertFileToObject(File file) {
        Map<String, String> field = new HashMap<>();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String key = "";
                int i=0;
                if (currentLine.contains("GRANT UPDATE")) {
                    break;
                }
                if (currentLine.contains(Constant.TBL_VARCHAR)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_VARCHAR)).trim();
                    field.put(i+key, key + "|" + Constant.TBL_VARCHAR);
                }
                if (currentLine.contains(Constant.TBL_NUMBER)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_NUMBER)).trim();
                    field.put(i+key, key + "|" + Constant.TBL_NUMBER);
                }
                if (currentLine.contains(Constant.TBL_DATE)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE)).trim();
                    field.put(i+key, key + "|" + Constant.TBL_DATE);
                }
                if (currentLine.contains(Constant.TBL_DATE_NOT_NULL)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE_NOT_NULL)).trim();
                    field.put(i+key, key + "|" + Constant.TBL_DATE);
                }
                currentLine = reader.readLine();

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
