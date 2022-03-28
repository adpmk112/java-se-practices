package javaSE.kmp.testingHibernate.controller;

import javaSE.kmp.testingHibernate.dataTransferObj.PersonDto;
import javaSE.kmp.testingHibernate.entity.Person;
import javaSE.kmp.testingHibernate.service.PersonService;
import javaSE.kmp.testingHibernate.view.AbstractView;
import javaSE.kmp.testingHibernate.view.PersonView;

import java.util.ArrayList;
import java.util.List;


public class PersonControllerImpl extends AbstractControllerImpl<Person, PersonView>
                                    implements PersonController<Person,Long>{

    private PersonService personService;

    public PersonControllerImpl(PersonService personService){
        this.personService = personService;
    }

    @Override
    public Person findById(Long id) {
        PersonDto dto = personService.findOne(id);
        return dto.getEntity();
    }

    @Override
    public List<Person> findAll() {
        List<PersonDto> dtoList = personService.findAll();
        List<Person>peopleList = null;
        for(PersonDto dto: dtoList){
            if(peopleList == null){
                peopleList = new ArrayList<>();
            }
            peopleList.add(dto.getEntity());
        }
        return peopleList;
    }

    @Override
    public Person save(Person model) {
        PersonDto dto = personService.save(new PersonDto(model));
        return dto.getEntity();
    }

    @Override
    public Person update(Person model) {
        PersonDto dto = personService.update(new PersonDto(model));
        return dto.getEntity();
    }

    @Override
    public void delete(Person model) {
        personService.delete(new PersonDto(model));
    }

    @Override
    public void deleteById(Long id) {
         personService.deleteById(id);
    }

    public PersonControllerImpl() {
        super();
    }

    @Override
    public Person getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(Person person) {
        super.setModel(person);
    }

    @Override
    public AbstractView<Person> getView() {
        return super.getView();
    }

    @Override
    public void setView(AbstractView<Person> view) {
        super.setView(view);
    }

    @Override
    public void printDetails(Person person) {
        super.printDetails(person);
    }

    @Override
    public void printDetails(List<Person> people) {
        super.printDetails(people);
    }
}
