package designPattern.structuralDesign.composite;

public class GameObject extends MainScene {

    public GameObject(String name) {
        super(name);
    }

    @Override
    void build() {
        System.out.println(this.name+" is built.");
    }
}
