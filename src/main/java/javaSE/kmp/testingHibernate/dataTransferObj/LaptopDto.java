package javaSE.kmp.testingHibernate.dataTransferObj;

import javaSE.kmp.testingHibernate.entity.BaseEntity;
import javaSE.kmp.testingHibernate.entity.Laptop;

public class LaptopDto extends BaseEntity<Long> {
    private String brand;
    private String description;

    public LaptopDto(Laptop laptop) {
        super.setId(laptop.getId());
        this.brand = laptop.getBrand();
        this.description = laptop.getDescription();
    }

    public Laptop getEntity(){
        Laptop laptop = new Laptop();
        laptop.setId(super.getId());
        laptop.setBrand(this.brand);
        laptop.setDescription(this.description);
        return laptop;
    }
}
