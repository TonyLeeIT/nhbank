package nhbank.core.util;

import nhbank.core.constant.Constant;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GenerateUtils {

    public static void buildDomain(String fileName, Map<Integer, String> listFields, File file) {
        String sFileName = fileName.replace(".sql", "");
        try {
            File target = new File("E:\\NHBANK_TARGET\\INFO\\" + fileName.replace(".sql", "") + "Info.java");
            target.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.domain; \n");
            outStream.writeBytes("import lombok.Data; \n");
            outStream.writeBytes("import javax.persistence.*; \n");
            outStream.writeBytes("import java.io.Serializable; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("@Entity \n");
            outStream.writeBytes("@IdClass(" + sFileName + "Info_ID.class" + ") \n");
            outStream.writeBytes("@Table(name = \"" + sFileName + "\") \n");
            outStream.writeBytes("@Data \n");
            outStream.writeBytes("public class " + sFileName + "Info implements Serializable { \n");
            listFields.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String dataType = v.substring(v.indexOf("|") + 1);
                String nameCamel = convertCamelCase(propertyName);
                if (findPrimaryKeys(file).containsKey(k)) {
                    try {
                        outStream.writeBytes("@Id \n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    outStream.writeBytes("@Column(name = \"" + propertyName + "\") \n");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                switch (dataType) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("private String " + nameCamel + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("private BigDecimal " + nameCamel + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("private Date " + nameCamel + "; \n");
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

    public static void buildDomainsID(String fileName, Map<Integer, String> listFields) throws IOException {
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
                String propertyName = v.substring(0, v.indexOf("|"));
                String dataType = v.substring(v.indexOf("|") + 1);
                String nameCamel = convertCamelCase(propertyName);
                switch (dataType) {
                    case Constant.TBL_VARCHAR:
                        try {
                            dataOutputStream.writeBytes("private String " + nameCamel + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            dataOutputStream.writeBytes("private BigDecimal " + nameCamel + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            dataOutputStream.writeBytes("private Date " + nameCamel + "; \n");
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

    public static void buildModel(String fileName, Map<Integer, String> listFields) {
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
                String propertyName = v.substring(0, v.indexOf("|"));
                String dataType = v.substring(v.indexOf("|") + 1);
                switch (dataType) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("private String " + propertyName + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("private BigDecimal " + propertyName + "; \n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("private Date " + propertyName + "; \n");
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

    public static void buildRepository(File file){
        String fileName = file.getName();
        String sFileName = fileName.replace(".sql", "");
        Map<Integer, String> mapOfPK = findPrimaryKeys(file);
        try {
            File target = new File("D:\\NHBANK_TARGET\\Repo\\" + fileName.replace(".sql", "") + "InfoRepository.java");
            target.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.repositories; \n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName +"Info; \n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName +"Info_ID; \n");
            outStream.writeBytes("import org.springframework.data.jpa.repository.JpaRepository; \n");
            outStream.writeBytes("import org.springframework.stereotype.Repository; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("import java.util.List;\n");
            outStream.writeBytes("@Repository\n");
            outStream.writeBytes("public interface "+sFileName+"InfoRepository extends JpaRepository<" +sFileName+"Info, "+sFileName+"Info_ID> { \n");

            final String[] stmt = {"\tboolean existsBy"};
            mapOfPK.forEach((k, v) -> {
                String camelCase;
                String pkName = v.substring(0, v.indexOf("|"));
                if((mapOfPK.values().toArray()[mapOfPK.size() - 1]).toString().contains(pkName)) {
                    camelCase = toCamelCase(pkName) + "(";
                } else {
                    camelCase = toCamelCase(pkName) + "And";
                }
                stmt[0] += camelCase;
            });
            outStream.writeBytes(stmt[0]);

            final String[] stmt1 = {""};
            mapOfPK.forEach((k, v) ->{
                String pkName;
                String pkType;
                pkName = v.substring(0, v.indexOf("|"));
                pkType = v.substring(v.indexOf("|") + 1);
                if(pkType.toUpperCase().equals(Constant.TBL_VARCHAR)) {
                    pkType = "String";
                } else if (pkType.toUpperCase().equals(Constant.TBL_NUMBER)){
                    pkType = "BigDecimal";
                } else if(pkType.toUpperCase().equals(Constant.TBL_DATE) || pkType.toUpperCase().equals(Constant.TBL_DATE_NOT_NULL)) {
                    pkType = "Date";
                }
                if((mapOfPK.values().toArray()[mapOfPK.size() - 1]).toString().contains(pkName)) {
                    pkName = convertCamelCase(pkName);
                    stmt1[0] += pkType + " " + pkName + ");";
                } else {
                    pkName = convertCamelCase(pkName);
                    stmt1[0] += pkType + " " + pkName + ", ";
                }
            });
            outStream.writeBytes(stmt1[0]);
            outStream.writeBytes("\n}");
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buildServices(File file) {
        String fileName = file.getName();
        String sFileName = fileName.replace(".sql", "");
        Map<Integer, String> mapOfPK = findPrimaryKeys(file);
        try {
            File target = new File("D:\\NHBANK_TARGET\\Services\\" + fileName.replace(".sql", "") + "InfoService.java");
            target.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.services;\n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName +"Info; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("import java.util.List;\n");
            outStream.writeBytes("public interface " + sFileName + "InfoService {\n");
            outStream.writeBytes("\tvoid updateAll();\n");
            outStream.writeBytes("\tvoid insertAll(List<" + sFileName + "Info> " + sFileName.toUpperCase() + "Infos);\n");
            final String[] stmt = {"\tboolean isExist("};
            mapOfPK.forEach((k, v) ->{
                String pkName;
                String pkType;
                pkName = v.substring(0, v.indexOf("|"));
                pkType = v.substring(v.indexOf("|") + 1);
                if(pkType.toUpperCase().equals(Constant.TBL_VARCHAR)) {
                    pkType = "String";
                } else if (pkType.toUpperCase().equals(Constant.TBL_NUMBER)){
                    pkType = "BigDecimal";
                } else if(pkType.toUpperCase().equals(Constant.TBL_DATE) || pkType.toUpperCase().equals(Constant.TBL_DATE_NOT_NULL)) {
                    pkType = "Date";
                }
                if((mapOfPK.values().toArray()[mapOfPK.size() - 1]).toString().contains(pkName)) {
                    pkName = convertCamelCase(pkName);
                    stmt[0] += pkType + " " + pkName + ");";
                } else {
                    pkName = convertCamelCase(pkName);
                    stmt[0] += pkType + " " + pkName + ", ";
                }
            });
            outStream.writeBytes(stmt[0]);
            outStream.writeBytes("\n}");
            outStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Map<Integer, String> findPrimaryKeys(File file) {
        Map<Integer, String> primaryKeysMap = new HashMap<>();
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
            for (int i = 0; i < primaryKeyArray.length; i++) {
                if (convertFileToObject(file).containsKey(i)) {
                    primaryKeysMap.put(i, convertFileToObject(file).get(i));
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return primaryKeysMap;
    }

    public static Map<Integer, String> convertFileToObject(File file) {
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
                    i++;
                }
                if (currentLine.contains(Constant.TBL_NUMBER)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_NUMBER)).trim();
                    field.put(i, key + "|" + Constant.TBL_NUMBER);
                    i++;
                }
                if (currentLine.contains(Constant.TBL_DATE)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE)).trim();
                    field.put(i, key + "|" + Constant.TBL_DATE);
                    i++;
                }
                if (currentLine.contains(Constant.TBL_DATE_NOT_NULL)) {
                    key = currentLine.substring(0, currentLine.indexOf(Constant.TBL_DATE_NOT_NULL)).trim();
                    field.put(i, key + "|" + Constant.TBL_DATE);
                    i++;
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
