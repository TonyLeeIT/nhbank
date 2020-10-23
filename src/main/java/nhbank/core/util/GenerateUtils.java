package nhbank.core.util;

import nhbank.core.constant.Constant;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class GenerateUtils {


    public static void buildDomain(String fileName, Map<Integer, String> listFields, File file) {
        String sFileName = fileName.replace(".sql", "");
        try {

            File target = new File("D:\\NHBANK_TARGET\\INFO\\" + fileName.replace(".sql", "") + "Info.java");
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

    public static void buildDomainsID(String fileName, Map<Integer, String> primaryKeyMap) throws IOException {
        String sFileName = fileName.replace(".sql", "");

        try {
            File target = new File("D:\\NHBANK_TARGET\\ID\\" + fileName.replace(".sql", "") + "Info_ID.java");
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
            primaryKeyMap.forEach((k, v) -> {
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
            File target = new File("D:\\NHBANK_TARGET\\" + fileName.replace(".sql", "") + "_DTO.java");
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

    public static void buildRepository(File file) {
        String fileName = file.getName();
        String sFileName = fileName.replace(".sql", "");
        Map<Integer, String> primaryKeyMap = findPrimaryKeys(file);
        try {
            File target = new File("D:\\NHBANK_TARGET\\Repo\\" + fileName.replace(".sql", "") + "InfoRepository.java");
            target.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.repositories; \n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName + "Info; \n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName + "Info_ID; \n");
            outStream.writeBytes("import org.springframework.data.jpa.repository.JpaRepository; \n");
            outStream.writeBytes("import org.springframework.stereotype.Repository; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("import java.util.List;\n");
            outStream.writeBytes("@Repository\n");
            outStream.writeBytes("public interface " + sFileName + "InfoRepository extends JpaRepository<" + sFileName + "Info, " + sFileName + "Info_ID> { \n");

            outStream.writeBytes("boolean existsBy");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String setter = convertGetterSetter(propertyName);
                try {
                    outStream.writeBytes(setter);
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes("And");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes("(");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String camelName = convertCamelCase(propertyName);
                String dataType = v.substring(v.indexOf("|") + 1);
                try {
                    switch (dataType) {
                        case Constant.TBL_VARCHAR:
                            outStream.writeBytes("String " + camelName);
                            break;
                        case Constant.TBL_NUMBER:
                            outStream.writeBytes("BigDecimal " + camelName);
                            break;
                        case Constant.TBL_DATE:
                            outStream.writeBytes("Date " + camelName);
                            break;
                        default:
                            break;
                    }
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes(", ");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes("); \n");
            outStream.writeBytes("\n}");
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buildServices(File file) {
        String fileName = file.getName();
        String sFileName = fileName.replace(".sql", "");
        Map<Integer, String> primaryKeyMap = findPrimaryKeys(file);
        try {
            File target = new File("D:\\NHBANK_TARGET\\Service\\" + fileName.replace(".sql", "") + "InfoService.java");
            target.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            outStream.writeBytes("package nhbank.core.services;\n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName + "Info; \n");
            outStream.writeBytes("import java.math.BigDecimal; \n");
            outStream.writeBytes("import java.util.Date; \n");
            outStream.writeBytes("import java.util.List;\n");
            outStream.writeBytes("public interface " + sFileName + "InfoService {\n");
            outStream.writeBytes("\tvoid updateAll();\n");
            outStream.writeBytes("\tvoid insertAll(List<" + sFileName + "Info> objList);\n");

            outStream.writeBytes(" boolean isExist( ");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String camelName = convertCamelCase(propertyName);
                String dataType = v.substring(v.indexOf("|") + 1);
                try {
                    switch (dataType) {
                        case Constant.TBL_VARCHAR:
                            outStream.writeBytes("String " + camelName);
                            break;
                        case Constant.TBL_NUMBER:
                            outStream.writeBytes("BigDecimal " + camelName);
                            break;
                        case Constant.TBL_DATE:
                            outStream.writeBytes("Date " + camelName);
                            break;
                        default:
                            break;
                    }
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes(", ");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes(");\n");
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
                if (currentLine.contains("GRANT SELECT")) {
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
                if (currentLine.contains("TABLESPACE")) {
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

    public static void buildServiceImpl(String fileName, Map<Integer, String> listFields, Map<Integer, String> primaryKeyMap) {
        String sFileName = fileName.replace(".sql", "");
        try {
            File target = new File("D:\\NHBANK_TARGET\\ServiceImpl\\" + fileName.replace(".sql", "") + "InfoServiceImpl.java");
            target.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(target);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
            outStream.writeBytes("package nhbank.core.services.impl; \n");
            outStream.writeBytes("import nhbank.core.config.PathConfig; \n");
            outStream.writeBytes("import nhbank.core.domain." + sFileName + "Info; \n");
            outStream.writeBytes("import nhbank.core.repositories." + sFileName + "InfoRepository;\n");
            outStream.writeBytes("import nhbank.core.services." + sFileName + "InfoService;\n");
            outStream.writeBytes("import org.springframework.beans.factory.annotation.Autowired;\n");
            outStream.writeBytes("import org.springframework.stereotype.Service;\n");
            outStream.writeBytes("import java.io.*;\n");
            outStream.writeBytes("import java.util.*;\n");
            outStream.writeBytes("import nhbank.core.util.DateUtils;\n");
            outStream.writeBytes("import java.math.BigDecimal;\n");
            outStream.writeBytes("import java.text.SimpleDateFormat;\n");
            outStream.writeBytes("@Service \n");
            outStream.writeBytes("public class " + sFileName + "InfoServiceImpl implements " + sFileName + "InfoService { \n");
            outStream.writeBytes("@Autowired \n");
            outStream.writeBytes("PathConfig pathConfig; \n");
            outStream.writeBytes("@Autowired \n");
            outStream.writeBytes(sFileName + "InfoRepository " + sFileName.toLowerCase() + "InfoRepository; \n");
            outStream.writeBytes("@Override \n");
            outStream.writeBytes("public void updateAll() { \n");
            outStream.writeBytes(" try { \n");
            outStream.writeBytes("List<" + sFileName + "Info" + "> objList = new ArrayList<>();\n");
            outStream.writeBytes("SimpleDateFormat formatter = new SimpleDateFormat(\"yyyy/MM/dd\");\n");
            outStream.writeBytes("String line; \n");
            outStream.writeBytes("String todayDate = DateUtils.dateYYYMMDD(); \n");
            outStream.writeBytes("String dataPath = pathConfig.getDataPath().replace(\"yyyymmdd\", todayDate); \n");
            outStream.writeBytes("File file = new File(dataPath + \"\\\\" + sFileName + ".dat\"); \n");
            outStream.writeBytes("if (!file.exists()){ \n");
            outStream.writeBytes("return; \n");
            outStream.writeBytes("} \n");
            outStream.writeBytes("BufferedReader br = new BufferedReader(new FileReader(dataPath + " + "\"\\\\" + sFileName + ".dat\"));\n");
            outStream.writeBytes("   while ((line = br.readLine()) != null) {\n");
            outStream.writeBytes("String[] lineArray = line.split(\"\\\\|\"); \n");
            outStream.writeBytes(sFileName + "Info obj = new " + sFileName + "Info(); \n");
            AtomicInteger i = new AtomicInteger();
            listFields.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String dataType = v.substring(v.indexOf("|") + 1);
                String setter = convertGetterSetter(propertyName);
                switch (dataType) {
                    case Constant.TBL_VARCHAR:
                        try {
                            outStream.writeBytes("obj.set" + setter + "(lineArray[" + i + "]);\n");
                            i.getAndIncrement();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_NUMBER:
                        try {
                            outStream.writeBytes("obj.set" + setter + "(new BigDecimal(lineArray[" + i + "])); \n");
                            i.getAndIncrement();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case Constant.TBL_DATE:
                        try {
                            outStream.writeBytes("obj.set" + setter + "((lineArray[" + i + "].equals(\"\")) ? null : formatter.parse(lineArray[" + i + "])); \n");
                            i.getAndIncrement();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    default:
                        break;
                }
            });

            outStream.writeBytes("if (isExist(");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String getter = convertGetterSetter(propertyName);
                try {
                    outStream.writeBytes("obj.get" + getter + "()");
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes(",");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes(")) { \n");
            outStream.writeBytes(sFileName.toLowerCase() + "InfoRepository.save(obj); \n");
            outStream.writeBytes("} else {\n");
            outStream.writeBytes("objList.add(obj);\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("if (!objList.isEmpty())\n");
            outStream.writeBytes(" insertAll(objList);\n");
            outStream.writeBytes("} catch (Exception ex) {\n");
            outStream.writeBytes(" ex.printStackTrace();\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("@Override\n");
            outStream.writeBytes("public void insertAll(List<" + sFileName + "Info> objList) {\n");
            outStream.writeBytes(sFileName.toLowerCase() + "InfoRepository.saveAll(objList);\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("@Override\n");
            outStream.writeBytes(" public boolean isExist( ");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String camelName = convertCamelCase(propertyName);
                String dataType = v.substring(v.indexOf("|") + 1);
                try {
                    switch (dataType) {
                        case Constant.TBL_VARCHAR:
                            outStream.writeBytes("String " + camelName);
                            break;
                        case Constant.TBL_NUMBER:
                            outStream.writeBytes("BigDecimal " + camelName);
                            break;
                        case Constant.TBL_DATE:
                            outStream.writeBytes("Date " + camelName);
                            break;
                        default:
                            break;
                    }
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes(", ");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes("){ \n");
            outStream.writeBytes(" return " + sFileName.toLowerCase() + "InfoRepository.existsBy");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String setter = convertGetterSetter(propertyName);
                try {
                    outStream.writeBytes(setter);
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes("And");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes("(");
            primaryKeyMap.forEach((k, v) -> {
                String propertyName = v.substring(0, v.indexOf("|"));
                String camelName = convertCamelCase(propertyName);
                try {
                    outStream.writeBytes(camelName);
                    if ((k < primaryKeyMap.size() - 1)) {
                        outStream.writeBytes(", ");
                    } else {
                        outStream.writeBytes("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outStream.writeBytes(");\n");
            outStream.writeBytes("}\n");
            outStream.writeBytes("}\n");
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static String convertCamelCase(String s) {
        return toCamelCase(s).substring(0, 1).toLowerCase() +
                toCamelCase(s).substring(1);
    }

    static String convertGetterSetter(String s) {
        return toCamelCase(s).substring(0, 1).toUpperCase() +
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
