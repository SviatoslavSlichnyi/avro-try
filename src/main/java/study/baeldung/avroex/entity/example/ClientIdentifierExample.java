package study.baeldung.avroex.entity.example;

import java.util.StringJoiner;

public class ClientIdentifierExample {
    private String hostName;
    private String ipAddress;

    public ClientIdentifierExample() {
    }

    public ClientIdentifierExample(String hostName, String ipAddress) {
        this.hostName = hostName;
        this.ipAddress = ipAddress;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientIdentifierExample that = (ClientIdentifierExample) o;

        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null) return false;
        return ipAddress != null ? ipAddress.equals(that.ipAddress) : that.ipAddress == null;
    }

    @Override
    public int hashCode() {
        int result = hostName != null ? hostName.hashCode() : 0;
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ClientIdentifierExample.class.getSimpleName() + "[", "]")
                .add("hostName='" + hostName + "'")
                .add("ipAddress='" + ipAddress + "'")
                .toString();
    }
}
