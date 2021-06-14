/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package study.baeldung.avroex.entity;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ClientIdentifier extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7570256039989809913L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClientIdentifier\",\"namespace\":\"study.baeldung.avroex.entity\",\"fields\":[{\"name\":\"hostName\",\"type\":\"string\"},{\"name\":\"ipAddress\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClientIdentifier> ENCODER =
      new BinaryMessageEncoder<ClientIdentifier>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClientIdentifier> DECODER =
      new BinaryMessageDecoder<ClientIdentifier>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClientIdentifier> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClientIdentifier> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClientIdentifier> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClientIdentifier>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClientIdentifier to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClientIdentifier from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClientIdentifier instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClientIdentifier fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence hostName;
   private java.lang.CharSequence ipAddress;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClientIdentifier() {}

  /**
   * All-args constructor.
   * @param hostName The new value for hostName
   * @param ipAddress The new value for ipAddress
   */
  public ClientIdentifier(java.lang.CharSequence hostName, java.lang.CharSequence ipAddress) {
    this.hostName = hostName;
    this.ipAddress = ipAddress;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return hostName;
    case 1: return ipAddress;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: hostName = (java.lang.CharSequence)value$; break;
    case 1: ipAddress = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'hostName' field.
   * @return The value of the 'hostName' field.
   */
  public java.lang.CharSequence getHostName() {
    return hostName;
  }


  /**
   * Sets the value of the 'hostName' field.
   * @param value the value to set.
   */
  public void setHostName(java.lang.CharSequence value) {
    this.hostName = value;
  }

  /**
   * Gets the value of the 'ipAddress' field.
   * @return The value of the 'ipAddress' field.
   */
  public java.lang.CharSequence getIpAddress() {
    return ipAddress;
  }


  /**
   * Sets the value of the 'ipAddress' field.
   * @param value the value to set.
   */
  public void setIpAddress(java.lang.CharSequence value) {
    this.ipAddress = value;
  }

  /**
   * Creates a new ClientIdentifier RecordBuilder.
   * @return A new ClientIdentifier RecordBuilder
   */
  public static study.baeldung.avroex.entity.ClientIdentifier.Builder newBuilder() {
    return new study.baeldung.avroex.entity.ClientIdentifier.Builder();
  }

  /**
   * Creates a new ClientIdentifier RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClientIdentifier RecordBuilder
   */
  public static study.baeldung.avroex.entity.ClientIdentifier.Builder newBuilder(study.baeldung.avroex.entity.ClientIdentifier.Builder other) {
    if (other == null) {
      return new study.baeldung.avroex.entity.ClientIdentifier.Builder();
    } else {
      return new study.baeldung.avroex.entity.ClientIdentifier.Builder(other);
    }
  }

  /**
   * Creates a new ClientIdentifier RecordBuilder by copying an existing ClientIdentifier instance.
   * @param other The existing instance to copy.
   * @return A new ClientIdentifier RecordBuilder
   */
  public static study.baeldung.avroex.entity.ClientIdentifier.Builder newBuilder(study.baeldung.avroex.entity.ClientIdentifier other) {
    if (other == null) {
      return new study.baeldung.avroex.entity.ClientIdentifier.Builder();
    } else {
      return new study.baeldung.avroex.entity.ClientIdentifier.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClientIdentifier instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClientIdentifier>
    implements org.apache.avro.data.RecordBuilder<ClientIdentifier> {

    private java.lang.CharSequence hostName;
    private java.lang.CharSequence ipAddress;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(study.baeldung.avroex.entity.ClientIdentifier.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.hostName)) {
        this.hostName = data().deepCopy(fields()[0].schema(), other.hostName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[1].schema(), other.ipAddress);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ClientIdentifier instance
     * @param other The existing instance to copy.
     */
    private Builder(study.baeldung.avroex.entity.ClientIdentifier other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.hostName)) {
        this.hostName = data().deepCopy(fields()[0].schema(), other.hostName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[1].schema(), other.ipAddress);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'hostName' field.
      * @return The value.
      */
    public java.lang.CharSequence getHostName() {
      return hostName;
    }


    /**
      * Sets the value of the 'hostName' field.
      * @param value The value of 'hostName'.
      * @return This builder.
      */
    public study.baeldung.avroex.entity.ClientIdentifier.Builder setHostName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.hostName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'hostName' field has been set.
      * @return True if the 'hostName' field has been set, false otherwise.
      */
    public boolean hasHostName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'hostName' field.
      * @return This builder.
      */
    public study.baeldung.avroex.entity.ClientIdentifier.Builder clearHostName() {
      hostName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ipAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getIpAddress() {
      return ipAddress;
    }


    /**
      * Sets the value of the 'ipAddress' field.
      * @param value The value of 'ipAddress'.
      * @return This builder.
      */
    public study.baeldung.avroex.entity.ClientIdentifier.Builder setIpAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ipAddress = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ipAddress' field has been set.
      * @return True if the 'ipAddress' field has been set, false otherwise.
      */
    public boolean hasIpAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ipAddress' field.
      * @return This builder.
      */
    public study.baeldung.avroex.entity.ClientIdentifier.Builder clearIpAddress() {
      ipAddress = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClientIdentifier build() {
      try {
        ClientIdentifier record = new ClientIdentifier();
        record.hostName = fieldSetFlags()[0] ? this.hostName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ipAddress = fieldSetFlags()[1] ? this.ipAddress : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClientIdentifier>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClientIdentifier>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClientIdentifier>
    READER$ = (org.apache.avro.io.DatumReader<ClientIdentifier>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.hostName);

    out.writeString(this.ipAddress);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.hostName = in.readString(this.hostName instanceof Utf8 ? (Utf8)this.hostName : null);

      this.ipAddress = in.readString(this.ipAddress instanceof Utf8 ? (Utf8)this.ipAddress : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.hostName = in.readString(this.hostName instanceof Utf8 ? (Utf8)this.hostName : null);
          break;

        case 1:
          this.ipAddress = in.readString(this.ipAddress instanceof Utf8 ? (Utf8)this.ipAddress : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










