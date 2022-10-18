package learn.intermediate.JavaJSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;
import java.util.Map;

public class JacksonObjectMapper {
    public static void main(String[] args) throws JsonProcessingException {
        // Inisialisasi ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Konversi Obyek Person ke JSON
        Person person = new Person("John", 25);
        System.out.println("Obyek Person ke JSON => " + objectMapper.writeValueAsString(person));

        // Membaca JSON ke Person Obyek
        String personJson = "{\"name\":\"John Doe\",\"age\":30}";
        Person person2 = objectMapper.readValue(personJson, Person.class);
        System.out.println("JSON ke Obyek Person => Name : " + person2.getName() + ", Age : " + person2.getAge());

        // Membaca JSON ke Java Map
        Map<String, Object> personMap = objectMapper.readValue(personJson, new TypeReference<Map<String, Object>>() {});
        System.out.println("JSON ke Map => " + personMap);

        // Membaca JSON List ke Java List
        String personJsonList = "[{\"name\":\"John\", \"age\": 25}, {\"name\":\"Jane\", \"age\":23}]";
        List<Person> personList = objectMapper.readValue(personJsonList, new TypeReference<List<Person>>() {});
        System.out.println(personList);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class Person {
        private String name;
        private int age;
    }
}