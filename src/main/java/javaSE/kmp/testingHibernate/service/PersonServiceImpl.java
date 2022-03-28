package javaSE.kmp.testingHibernate.service;

import javaSE.kmp.testingHibernate.dataAccessObj.PersonDaoImpl;
import javaSE.kmp.testingHibernate.dataTransferObj.PersonDto;
import javaSE.kmp.testingHibernate.entity.Person;
import javaSE.kmp.testingHibernate.respository.PersonRespository;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService{

    private PersonRespository repo;

    public PersonServiceImpl(PersonRespository repo){
        this.repo = repo;
    }

    @Override
    public PersonDto save(PersonDto entity) {
        Person person = repo.save(entity.getEntity());
        return new PersonDto(person);
    }

    @Override
    public PersonDto findOne(Long id) {
        Person person = repo.findOne(id); 
        PersonDto dto = new PersonDto(person);
        return dto;
    }

    @Override
    public List<PersonDto> findAll() {
        List<Person> people = repo.findAll();
        List<PersonDto> peopleListDto = null;
        for(Person person:people){
            if(peopleListDto==null){
                peopleListDto = new ArrayList<>();
            }
            PersonDto dto = new PersonDto(person);
            peopleListDto.add(dto);
        }
        return peopleListDto;
    }

    @Override
    public PersonDto update(PersonDto entity) {
        Person person  = repo.update(entity.getEntity());
        return new PersonDto(person);
    }

    @Override
    public void delete(PersonDto entity) {
        repo.delete(entity.getEntity());
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
