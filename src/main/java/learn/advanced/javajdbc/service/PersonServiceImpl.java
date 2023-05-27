package learn.advanced.javajdbc.service;

import learn.advanced.javajdbc.dto.PersonRequest;
import learn.advanced.javajdbc.dto.PersonResponse;
import learn.advanced.javajdbc.model.Person;
import learn.advanced.javajdbc.repository.PersonRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     * @return list of PersonResponse
     */
    @Override
    public List<PersonResponse> getAll() {

        List<Person> personList = personRepository.findAll();

        return personList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    /**
     * @param request a record for dto person
     * @return object  response
     */
    @Override
    public PersonResponse create(PersonRequest request) {

        Person person = new Person();
        person.setId(UUID.randomUUID().toString());
        person.setFirstName(request.firstName());
        person.setLastName(request.lastName());
        person.setEmail(request.email());
        person.setAddress(request.address());
        person.setAge(request.age());

        personRepository.insert(person);

        return convertToResponse(person);
    }

    /**
     * @param id id of person
     * @return object PersonResponse
     */
    @Override
    public PersonResponse getById(String id) {
        Person person = personRepository.get(id);

        return convertToResponse(person);
    }

    @Override
    public PersonResponse update(PersonRequest request, String id) {
        Person person = personRepository.get(id);
        person.setFirstName(request.firstName());
        person.setLastName(request.lastName());
        person.setEmail(request.email());
        person.setAddress(request.address());
        person.setAge(request.age());

        personRepository.update(person);

        return convertToResponse(person);
    }

    @Override
    public void delete(String id) {
        personRepository.delete(id);
    }

    private PersonResponse convertToResponse(Person person) {
        return new PersonResponse(
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                person.getEmail(),
                person.getAddress(),
                person.getAge()
        );
    }
}
