package javaSE.kmp.testingHibernate.controller;

import javaSE.kmp.testingHibernate.dataTransferObj.LaptopDto;
import javaSE.kmp.testingHibernate.entity.Laptop;
import javaSE.kmp.testingHibernate.service.LaptopService;
import javaSE.kmp.testingHibernate.view.AbstractView;
import javaSE.kmp.testingHibernate.view.LaptopView;

import java.util.ArrayList;
import java.util.List;

public class LaptopControllerImpl extends AbstractControllerImpl<Laptop, LaptopView>
                                 implements LaptopController<Laptop, Long> {

    private LaptopService laptopService;

    public LaptopControllerImpl(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Override
    public Laptop findById(Long id) {
        LaptopDto laptopDto = laptopService.findOne(id);
        return laptopDto.getEntity();
    }

    @Override
    public void deleteById(Long id) {
        laptopService.deleteById(id);
    }

    @Override
    public List<Laptop> findAll() {
        List<LaptopDto> dtoList = laptopService.findAll();
        List<Laptop> laptopList = null;
        for (LaptopDto dto : dtoList) {
            if (laptopList == null) {
                laptopList = new ArrayList<>();
            }
            laptopList.add(dto.getEntity());
        }
        return laptopList;
    }

    @Override
    public Laptop save(Laptop model) {
        LaptopDto laptopDto = laptopService.save(new LaptopDto(model));
        return laptopDto.getEntity();
    }

    @Override
    public Laptop update(Laptop model) {
        LaptopDto laptopDto = laptopService.update(new LaptopDto(model));
        return laptopDto.getEntity();
    }

    @Override
    public void delete(Laptop model) {
        laptopService.delete(new LaptopDto(model));
    }

    public LaptopControllerImpl() {
        super();
    }

    @Override
    public Laptop getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(Laptop laptop) {
        super.setModel(laptop);
    }

    @Override
    public AbstractView<Laptop> getView() {
        return super.getView();
    }

    @Override
    public void setView(AbstractView<Laptop> view) {
        super.setView(view);
    }

    @Override
    public void printDetails(Laptop laptop) {
        super.printDetails(laptop);
    }

    @Override
    public void printDetails(List<Laptop> laptops) {
        super.printDetails(laptops);
    }
}