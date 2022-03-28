package designPatternTest.structuralDesign;

public class BridgeTest {
    public static void main(String[] args) {
        DrawingSoftware software = new Blender();
        Character character = new ThreeDimentional(software);
        character.draw();
    }
}

interface DrawingSoftware{
    void draw2D();
    void draw3D();
}

class Maya implements DrawingSoftware{

    @Override
    public void draw2D() {
        System.out.println("Creating 2D character with Maya");
    }

    @Override
    public void draw3D() {
        System.out.println("Creating 3D character with Maya");
    }
}

class Blender implements DrawingSoftware{

    @Override
    public void draw2D() {
        System.out.println("Creating 2D character with Blender");
    }

    @Override
    public void draw3D() {
        System.out.println("Creating 3D character with Blender");
    }
}

abstract class Character{

    DrawingSoftware drawingSoftware;

    public Character(DrawingSoftware drawingSoftware){
        this.drawingSoftware = drawingSoftware;
    }
    abstract void draw();
}

class TwoDimentional extends Character{

    public TwoDimentional(DrawingSoftware drawingSoftware) {
        super(drawingSoftware);
    }

    @Override
    void draw() {
        drawingSoftware.draw2D();
    }
}

class ThreeDimentional extends Character{

    public ThreeDimentional(DrawingSoftware drawingSoftware) {
        super(drawingSoftware);
    }

    @Override
    void draw() {
        drawingSoftware.draw3D();
    }
}
