package nhbank.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {
    public static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static List<String> getFilesDirectory(String directoryPath) {
        List<String> result = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(Paths.get(directoryPath))) {
            result = walk.filter(Files::isRegularFile)
                    .map(Path::toString).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return result;
    }

    public static void moveFile(String inputFile, String outputFile, String fileName) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        File afile = new File(inputFile + "\\" + fileName);
        File bfile = new File(outputFile);
        try {
            if (!bfile.exists() || !bfile.isDirectory()) {
                logger.error("Backup folder not exist");
                Path path = Paths.get(outputFile);
                Files.createDirectories(path);
            }
            String todayDate = DateUtils.dateYYYMMDD();
            File newFile = new File(outputFile + "\\" + todayDate + fileName + ".bak");

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);

            }
            //delete the original file

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inStream != null) inStream.close();
            if (outStream != null) outStream.close();
        }
    }

    public static void createFile(String dir, List<String> content) {
        Charset utf8 = StandardCharsets.UTF_8;
        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(dir), utf8)
        )) {
            for (String s : content) {
                writer.write(s + "\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            logger.error(e.getMessage());
        }
    }

    public static void deleteFile(File file) {
        if (file.delete()) {
            logger.info("File is deleted successfully");
        } else {
            logger.error("Failed to delete the file");
        }
        logger.info("File is copied successful!");
    }

    public static String handlingFile(String file) {
        return file.substring(0, file.indexOf("(")).concat(file.substring(file.indexOf(")") + 1));
    }
}
