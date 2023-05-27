package learn.advanced.javajdbc.service;

import learn.advanced.javajdbc.dto.PersonRequest;
import learn.advanced.javajdbc.dto.PersonResponse;

import java.util.List;

public interface PersonService {

    List<PersonResponse> getAll();
    PersonResponse create(PersonRequest request);

    PersonResponse getById(String id);

    PersonResponse update(PersonRequest request, String id);

    void delete(String id);
}
