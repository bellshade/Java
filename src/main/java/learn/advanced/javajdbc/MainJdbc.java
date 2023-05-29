package learn.advanced.javajdbc;

import learn.advanced.javajdbc.dto.PersonRequest;
import learn.advanced.javajdbc.dto.PersonResponse;
import learn.advanced.javajdbc.repository.PersonRepository;
import learn.advanced.javajdbc.service.PersonService;
import learn.advanced.javajdbc.service.PersonServiceImpl;

import java.util.List;

public class MainJdbc {

    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        PersonService personService = new PersonServiceImpl(repository);

        PersonRequest personRequest = new PersonRequest(
                "test name",
                "test",
                "test@mail,com",
                "test address",
                23
        );

        PersonResponse createPerson = personService.create(personRequest);
        System.out.println(createPerson.toString());

        PersonResponse personResponse = personService.getById("776187c2-66c5-4e91-89f9-1dbe89c17bba");
        System.out.println(personResponse.toString());

        PersonResponse personUpdate = personService.update( personRequest,"776187c2-66c5-4e91-89f9-1dbe89c17bba");
        System.out.println(personUpdate.toString());

        List<PersonResponse> personResponses = personService.getAll();
        System.out.println(personResponses.size());


    }
}
