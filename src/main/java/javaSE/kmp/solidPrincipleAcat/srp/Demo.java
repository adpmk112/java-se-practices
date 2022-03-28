package javaSE.kmp.solidPrincipleAcat.srp;

import javaSE.kmp.solidPrincipleAcat.dip.*;
import javaSE.kmp.solidPrincipleAcat.isp.Egret;
import javaSE.kmp.solidPrincipleAcat.isp.Lion;
import javaSE.kmp.solidPrincipleAcat.lsp.*;
import javaSE.kmp.solidPrincipleAcat.ocp.AndCondition;
import javaSE.kmp.solidPrincipleAcat.ocp.ColorCondition;
import javaSE.kmp.solidPrincipleAcat.ocp.SizeCondition;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        //demo.ocpTest();
        //demo.lspViolation();
        //demo.lsp();
        //demo.isp();
        demo.dip();
    }
    public List<Product> getAllProducts()
    {
        Product shirt = new Product
                        ("Shirt",10000,Size.M,Color.WHITE);
        Product jacket = new Product
                ("Jacket",20000,Size.L,Color.BLACK);
        Product underwear = new Product
                ("Underwear",9000,Size.XL,Color.BLUE);
        return List.of(shirt,jacket,underwear);
    }
    public void ocpTest(){
       /* for(Product out: srpDemo.getAllProducts()){
            System.out.println(out.getName());
        }*/
        ProductFilter productFilter = new ProductFilter();

        productFilter.filter
                (getAllProducts(), new ColorCondition(Color.WHITE));

        System.out.println("---------------");

        productFilter.filter
                (getAllProducts(),new SizeCondition(Size.XL));

        System.out.println("---------------");

        productFilter.filter(getAllProducts(),
                new AndCondition(new ColorCondition(Color.WHITE),
                        new SizeCondition(Size.M)));
    }
    public void lspViolation() {
        Bird bird = new Bird();
        bird.fly();

        Aeroplane plane = new Aeroplane();
        plane.fly();
    }
    public void lsp(){
        Retangle retangle = new Retangle();
        retangle.setLength(5);
        retangle.setWidth(3);
        System.out.println("Retangle area -->"+retangle.getArea());

        Square square = new Square();
        square.setSide(2);
        System.out.println("Square area -->"+square.getArea());
    }
    public void isp()
    {
        Lion lion = new Lion();
        lion.sleep();
        lion.eat();
        lion.sex();
        lion.walk();

        Egret egret = new Egret();
        egret.walk();
        egret.eat();
        egret.swim();
        egret.fly();
    }

    public void dip() {
        Wheel wheel = new Wheel();
        Gasoline diesel = new DieselOil();
        Gasoline octane = new OctaneOil();

        Vehicle car = new DieselCar(wheel,octane);
        car.drive();
    }
}
