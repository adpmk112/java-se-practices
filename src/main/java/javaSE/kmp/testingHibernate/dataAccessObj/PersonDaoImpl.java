package javaSE.kmp.testingHibernate.dataAccessObj;

import javaSE.kmp.testingHibernate.entity.Person;
import javaSE.kmp.testingHibernate.respository.PersonRespository;

import java.util.List;

public class PersonDaoImpl extends AbstractDaoImpl<Person,Long> implements PersonRespository {

    public PersonDaoImpl(){
        super();
    }
    @Override
    public Person save(Person entity) {
        return super.save(entity);
    }

    @Override
    public List findAll() {
        return super.findAll();
    }

    @Override
    public Person findOne(Long aLong) {
        return super.findOne(aLong);
    }

    @Override
    public Person update(Person entity) {
        return super.update(entity);
    }

    @Override
    public void delete(Person entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
