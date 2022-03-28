package javaSE.kmp.testingHibernate.service;

import com.sun.xml.bind.v2.model.core.ID;
import javaSE.kmp.testingHibernate.dataTransferObj.LaptopDto;
import javaSE.kmp.testingHibernate.entity.Laptop;
import javaSE.kmp.testingHibernate.respository.LaptopRepository;

import java.util.ArrayList;
import java.util.List;

public class LaptopServiceImpl implements LaptopService{

    private LaptopRepository lpRepo;

    public LaptopServiceImpl(LaptopRepository lpRepo){
        this.lpRepo = lpRepo;
    }

    @Override
    public LaptopDto save(LaptopDto entity) {
        Laptop laptop = lpRepo.save(entity.getEntity());
        return new LaptopDto(laptop);
    }

    @Override
    public LaptopDto findOne(Long id) {
        Laptop laptop = lpRepo.findOne(id);
        LaptopDto laptopDto = new LaptopDto(laptop);
        return laptopDto;
    }

    @Override
    public List<LaptopDto> findAll() {
        List<Laptop> laptops = lpRepo.findAll();
        List<LaptopDto> laptopDtoList = null;
        for(Laptop laptop : laptops){
            if(laptopDtoList == null){
                laptopDtoList = new ArrayList<>();
            }
            LaptopDto laptopDto = new LaptopDto(laptop);
            laptopDtoList.add(laptopDto);
        }
        return laptopDtoList;
    }

    @Override
    public LaptopDto update(LaptopDto entity) {
        Laptop laptop = lpRepo.update(entity.getEntity());
        return new LaptopDto(laptop);
    }

    @Override
    public void delete(LaptopDto entity) {
        lpRepo.delete(entity.getEntity());
    }

    @Override
    public void deleteById(Long id) {
        lpRepo.deleteById(id);
    }
}
