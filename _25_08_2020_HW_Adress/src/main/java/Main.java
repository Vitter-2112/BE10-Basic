import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Address address = mapper.readValue(new File("test.json"), Address.class);
        System.out.println(address);

        Address a1 = new Address();
        a1.setCity("Berlin");
        a1.setStreet("Friedrichstr.");
        a1.setHome(1);

        mapper.writeValue(new File("output.json"), a1);
    }
}
