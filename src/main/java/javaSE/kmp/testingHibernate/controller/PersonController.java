package javaSE.kmp.testingHibernate.controller;

import javaSE.kmp.testingHibernate.entity.Person;
import javaSE.kmp.testingHibernate.view.AbstractView;

import java.util.List;

public interface PersonController <T extends Person,ID extends Comparable<ID>>
        extends AbstractView<T> {

    T findById(ID id);
    List<T> findAll();
    
    T save(T model);
    T update(T model);
    void delete(T model);
    void deleteById(ID id);
}
