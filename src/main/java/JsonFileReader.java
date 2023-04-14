import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonFileReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File personFile = new File("D:/Java Projects/Json/src/main/resources/Person.json");
        Person person = objectMapper.readValue(personFile, Person.class);

        File actorsFile = new File("D:/Java Projects/Json/src/main/resources/Actors.json");
        List<Actors> actor = objectMapper.readValue(actorsFile, new TypeReference<List<Actors>>() {});


        System.out.println("Person's data : \n"+person);
        System.out.println("\nActors' data : \n"+ actor);

    }
}
