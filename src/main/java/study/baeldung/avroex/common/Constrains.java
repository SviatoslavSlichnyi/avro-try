package study.baeldung.avroex.common;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constrains {
    public static final Path resourcePath = Paths.get("src", "main", "resources");

    public static final Path avroDirPath = Paths.get(resourcePath.toString(), "avro");
    public static final Path avroDataFilePath = Paths.get(avroDirPath.toString(), "data.avro");
    public static final Path avroDataFilePath_DataFileWriter = Paths.get(avroDirPath.toString(), "data-data_file_writer.avro");

    public static final Path avscDirPath = Paths.get(Constrains.resourcePath.toString(), "avsc");
    public static final Path clientIdentifierSchemaFilePath = Paths.get(avscDirPath.toString(), "clientIdentifierSchema.avsc");
    public static final Path avroHttpRequestSchemaFilePath = Paths.get(avscDirPath.toString(), "avroHttpRequestSchema.avsc");
}
