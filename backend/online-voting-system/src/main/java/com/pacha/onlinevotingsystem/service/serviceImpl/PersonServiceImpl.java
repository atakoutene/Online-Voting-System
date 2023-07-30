package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.payload.PersonDto;
import com.pacha.onlinevotingsystem.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public List<PersonDto> getAllPersons() {
        return null;
    }

    @Override
    public PersonDto getPersonById(long id) {
        return null;
    }

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        return null;
    }

    @Override
    public PersonDto updatePerson(long id, PersonDto personDto) {
        return null;
    }

    @Override
    public void deletePerson(long id) {

    }
}
