package com.bridgelabz.h2databasedemo.Service;

import com.bridgelabz.h2databasedemo.DTo.PersonDTO;
import com.bridgelabz.h2databasedemo.model.Person;
import com.bridgelabz.h2databasedemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String addPerson(PersonDTO personDTO){

        Person person=new Person();
        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        person.setMobileNo(personDTO.getMobileNo());

        personRepository.save(person);

        return "Person added Successfully !!!";
    }
}
