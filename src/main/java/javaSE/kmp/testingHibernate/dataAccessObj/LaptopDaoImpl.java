package javaSE.kmp.testingHibernate.dataAccessObj;

import javaSE.kmp.testingHibernate.entity.Laptop;
import javaSE.kmp.testingHibernate.respository.LaptopRepository;

import java.util.List;

public class LaptopDaoImpl extends AbstractDaoImpl<Laptop,Long> implements LaptopRepository {

    public LaptopDaoImpl(){
        super();
    }

    @Override
    public Laptop save(Laptop entity) {
        return super.save(entity);
    }

    @Override
    public Laptop findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public List findAll() {
        return super.findAll();
    }

    @Override
    public Laptop update(Laptop entity) {
        return super.update(entity);
    }

    @Override
    public void delete(Laptop entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
