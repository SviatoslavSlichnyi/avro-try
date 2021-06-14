package study.baeldung.avroex;

import study.baeldung.avroex.common.Constrains;
import study.baeldung.avroex.common.FileUtil;
import study.baeldung.avroex.entity.Active;
import study.baeldung.avroex.entity.AvroHttpRequest;
import study.baeldung.avroex.entity.ClientIdentifier;
import study.baeldung.avroex.serializer.AvroDeserializer;
import study.baeldung.avroex.serializer.AvroSerializer;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static final AvroSerializer serializer = new AvroSerializer();
    private static final AvroDeserializer deserializer = new AvroDeserializer();

    public static void main(String[] args) throws IOException {
        AvroHttpRequest request = new AvroHttpRequest(
                12342345L,
                new ClientIdentifier("test.com", "0.0.0.0:8080"),
                Arrays.asList("Steve", "Peter", "Max"),
                Active.YES
        );

        // by byte array
        byte[] data = serializer.serializeAvroHttpRequestJSON(request);
        System.out.println("byte[]: " + new String(data));
        FileUtil.saveAvroToFile(data);

        byte[] dataFromFile = FileUtil.readArvoFromFile();
        System.out.println("byte[] from file: " + new String(data));
        AvroHttpRequest httpRequest = deserializer.deSerializeAvroHttpRequestJSON(dataFromFile);
        System.out.println("httpRequest: " + httpRequest);


        // by DataWriter
        serializer.saveToFile(request, Constrains.avroDataFilePath_DataFileWriter.toFile());
        AvroHttpRequest readFromFile_DataFileWriter = deserializer.readFromFile(Constrains.avroDataFilePath_DataFileWriter.toFile());
        System.out.println("DataFileWriter: " + readFromFile_DataFileWriter);
    }

}
