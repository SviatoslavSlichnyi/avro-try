package study.baeldung.avroex;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import study.baeldung.avroex.common.Constrains;
import study.baeldung.avroex.common.FileUtil;

import java.io.IOException;
import java.nio.file.Files;

public class GenerateAvsvSchemaFiles {
    public static void main(String[] args) throws IOException {
        Schema clientIdentifierSchema = SchemaBuilder.record("ClientIdentifier")
                .namespace("study.baeldung.avroex.entity")
                .fields()
                    .requiredString("hostName")
                    .requiredString("ipAddress")
                .endRecord();

        System.out.println("ClientIdentifier:");
        System.out.println(clientIdentifierSchema.toString());

        Schema avroHttpRequestSchema = SchemaBuilder.record("AvroHttpRequest")
                .namespace("study.baeldung.avroex.entity")
                .fields()
                    .requiredLong("requestTime")
                    .name("clientIdentifier")
                    .   type(clientIdentifierSchema)
                        .noDefault()
                    .name("employeeNames")
                        .type().array()
                        .items().stringType()
                        .noDefault()
                    .name("active")
                        .type().enumeration("Active")
                        .symbols("YES", "NO")
                        .noDefault()
                    .endRecord();

        System.out.println("AvroHttpRequest:");
        System.out.println(avroHttpRequestSchema.toString());

        // saving to src/main/resources/avsc/
        FileUtil.saveAvscToFile(clientIdentifierSchema.toString(), Constrains.clientIdentifierSchemaFilePath);
        FileUtil.saveAvscToFile(avroHttpRequestSchema.toString(), Constrains.avroHttpRequestSchemaFilePath);

        System.out.println("----------------------");

        String clientIdentifierSchemaFromFile = Files.readString(Constrains.clientIdentifierSchemaFilePath);
        String avroHttpRequestSchemaFromFile = Files.readString(Constrains.avroHttpRequestSchemaFilePath);

        System.out.println("ClientIdentifier from File:");
        System.out.println(clientIdentifierSchemaFromFile);
        System.out.println("AvroHttpRequest from File:");
        System.out.println(avroHttpRequestSchemaFromFile);
    }
}
