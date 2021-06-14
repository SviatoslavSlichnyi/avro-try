package study.baeldung.avroex.serializer;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import study.baeldung.avroex.entity.AvroHttpRequest;

import java.io.File;
import java.io.IOException;

public class AvroDeserializer {

    public AvroHttpRequest deSerializeAvroHttpRequestJSON(byte[] data) throws IOException {
        DatumReader<AvroHttpRequest> reader = new SpecificDatumReader<>(AvroHttpRequest.class);
        Decoder decoder = DecoderFactory.get().jsonDecoder(study.baeldung.avroex.entity.AvroHttpRequest.SCHEMA$, new String(data));
        return reader.read(null, decoder);
    }

    public AvroHttpRequest deSerializeAvroHttpRequestBinary(byte[] data) throws IOException {
        DatumReader<AvroHttpRequest> reader = new SpecificDatumReader<>(AvroHttpRequest.class);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        return reader.read(null, decoder);
    }

    public AvroHttpRequest readFromFile(File file) throws IOException {
        // Deserialize Users from disk
        DatumReader<AvroHttpRequest> userDatumReader = new SpecificDatumReader<>(AvroHttpRequest.class);
        DataFileReader<AvroHttpRequest> dataFileReader = new DataFileReader<>(file, userDatumReader);
        AvroHttpRequest request = null;
        while (dataFileReader.hasNext()) {
            // Reuse user object by passing it to next(). This saves us from
            // allocating and garbage collecting many objects for files with
            // many items.
            request = dataFileReader.next(request);
        }

        return request;
    }
}
