package study.baeldung.avroex.serializer;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import study.baeldung.avroex.entity.AvroHttpRequest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class AvroSerializer {

    public byte[] serializeAvroHttpRequestJSON(AvroHttpRequest request) throws IOException {
        DatumWriter<AvroHttpRequest> writer = new SpecificDatumWriter<>(AvroHttpRequest.class);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().jsonEncoder(AvroHttpRequest.SCHEMA$, stream);
        writer.write(request, encoder);
        encoder.flush();
        return stream.toByteArray();
    }

    public byte[] serializeAvroHttpRequestBinary(AvroHttpRequest request) throws IOException {
        DatumWriter<AvroHttpRequest> writer = new SpecificDatumWriter<>(AvroHttpRequest.class);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().binaryEncoder(stream, null);
        writer.write(request, encoder);
        encoder.flush();
        return stream.toByteArray();
    }

    public void saveToFile(AvroHttpRequest request, File file) throws IOException {
        DatumWriter<AvroHttpRequest> datumWriter = new SpecificDatumWriter<>(AvroHttpRequest.class);

        DataFileWriter<AvroHttpRequest> dataFileWriter = new DataFileWriter<>(datumWriter);
        dataFileWriter.create(AvroHttpRequest.getClassSchema(), file);
        dataFileWriter.append(request);
        dataFileWriter.close();
    }
}
