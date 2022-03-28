package javaSE.kmp.testingHibernate.dataAccessObj;

import java.util.List;

public interface AbstractDao<T, ID extends Comparable<ID>>{
    T save(T entity);
    T findOne(ID id);
    T update(T entity);

    void delete(T entity);
    void deleteById(ID id);

    List<T> findAll();
}
