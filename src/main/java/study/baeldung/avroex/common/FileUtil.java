package study.baeldung.avroex.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    public static void saveAvroToFile(byte[] data) throws IOException {
        if (Files.notExists(Constrains.avroDirPath)) Files.createDirectory(Constrains.avroDirPath);
        if (Files.notExists(Constrains.avroDataFilePath)) Files.createFile(Constrains.avroDataFilePath);

        Files.writeString(Constrains.avroDataFilePath, new String(data));
    }

    public static byte[] readArvoFromFile() throws IOException {
        return Files.readAllBytes(Constrains.avroDataFilePath);
    }

    public static void saveArscToFile(String data, Path file) throws IOException {
        if (Files.notExists(Constrains.avscDirPath)) Files.createDirectory(Constrains.avscDirPath);

        if (Files.notExists(file)) Files.createFile(file);
//        if (Files.notExists(Constrains.avroHttpRequestSchemaFilePath)) Files.createFile(Constrains.avroHttpRequestSchemaFilePath);

        Files.writeString(file, data);
//        Files.writeString(Constrains.avroHttpRequestSchemaFilePath, avroHttpRequestSchema.toString());

    }
}
