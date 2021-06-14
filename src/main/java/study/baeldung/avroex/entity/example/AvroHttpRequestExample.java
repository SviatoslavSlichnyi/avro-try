package study.baeldung.avroex.entity.example;

import java.util.List;
import java.util.StringJoiner;

public class AvroHttpRequestExample {

    private long requestTime;
    private ClientIdentifierExample clientIdentifierExample;
    private List<String> employeeNames;
    private ActiveEx active;

    public AvroHttpRequestExample() {
    }

    public AvroHttpRequestExample(long requestTime, ClientIdentifierExample clientIdentifierExample, List<String> employeeNames, ActiveEx active) {
        this.requestTime = requestTime;
        this.clientIdentifierExample = clientIdentifierExample;
        this.employeeNames = employeeNames;
        this.active = active;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

    public ClientIdentifierExample getClientIdentifier() {
        return clientIdentifierExample;
    }

    public void setClientIdentifier(ClientIdentifierExample clientIdentifierExample) {
        this.clientIdentifierExample = clientIdentifierExample;
    }

    public List<String> getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(List<String> employeeNames) {
        this.employeeNames = employeeNames;
    }

    public ActiveEx getActive() {
        return active;
    }

    public void setActive(ActiveEx active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AvroHttpRequestExample.class.getSimpleName() + "[", "]")
                .add("requestTime=" + requestTime)
                .add("clientIdentifier=" + clientIdentifierExample)
                .add("employeeNames=" + employeeNames)
                .add("active=" + active)
                .toString();
    }
}
