package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.payload.CommentDto;
import com.pacha.onlinevotingsystem.payload.PersonDto;

import java.util.List;

public interface PersonService {

    List<PersonDto> getAllPersons();
    PersonDto getPersonById(long id);

    PersonDto createPerson(PersonDto personDto);

    PersonDto updatePerson(long id, PersonDto personDto);

    void deletePerson(long id);
}
