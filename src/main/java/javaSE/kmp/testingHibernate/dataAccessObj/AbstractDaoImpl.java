package javaSE.kmp.testingHibernate.dataAccessObj;

import javaSE.kmp.testingHibernate.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDaoImpl<T,ID extends Comparable<ID>> implements AbstractDao<T,ID> {

    private Class<T> entityName = null;
    private Session session = null;
    private Transaction tx = null;

    @SuppressWarnings("unchecked")
    public AbstractDaoImpl(){
        this.entityName =(Class<T>)
                ((ParameterizedType)this.getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];       //Generic to Class
    }

    @Override
    public T findOne(ID id) {
        T entity = null;
        try{
            startOperation();
            entity = session.get(entityName,id); //select * from table_name where id=?
            tx.commit();
        }
        catch (HibernateException e){
            tx.rollback();
        }
        finally {
            session.close();
        }
        return entity;
    }

    @Override
    public T save(T entity) {
        try{
            startOperation();
            session.save(entity);
            tx.commit();
        }
        catch (HibernateException e){
            tx.rollback();
        }
        finally {
            session.close();
        }
        return entity;
    }

    @SuppressWarnings("unchecked")
    @Override
     public List findAll() {

        List<T>data = null;
        try{
            startOperation();
            TypedQuery<T> query = session.createQuery
                    ("from "+entityName.getName());
            data = query.getResultList();
            tx.commit();
        }
        catch (HibernateException e){
            tx.rollback();
        }
        finally {
            session.close();
        }
        return data;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T update(T entity) {
        try{
            startOperation();
            entity = (T) session.merge(entity);
            tx.commit();
        }
        catch (HibernateException e){
            tx.rollback();
        }
        finally {
            session.close();
        }
        return entity;
    }

    @Override
    public void delete(T entity) {
        try{
            startOperation();
            session.delete(entity);
            tx.commit();
        }
        catch (HibernateException e){
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

    @Override
    public void deleteById(ID id) {
        T entity = findOne(id);
        delete(entity);
    }

    private void startOperation(){
        session = HibernateUtils.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
}
