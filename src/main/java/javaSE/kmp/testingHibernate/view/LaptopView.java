package javaSE.kmp.testingHibernate.view;

import javaSE.kmp.testingHibernate.entity.Laptop;

public class LaptopView extends AbstractViewImpl<Laptop> {
    @Override
    public void printDetails(Laptop model) {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop id = ");
        sb.append(model.getId());
        sb.append(", Laptop brand = ");
        sb.append(model.getBrand());
        sb.append(", Laptop Description = ");
        sb.append(model.getDescription());
        System.out.println(sb.toString());
    }
}
