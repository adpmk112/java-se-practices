package designPatternTest.structuralDesign;

public class FacadeTest {
    public static void main(String[] args) {
        CharacterController controller = new CharacterController();
        controller.showAvailableDirection();
    }
}

interface ThreeDimensionalMovement{
    void move();
}

class ForwardBackward implements ThreeDimensionalMovement{

    @Override
    public void move() {
        System.out.println("Z axis");
    }
}

class LeftRight implements ThreeDimensionalMovement{

    @Override
    public void move() {
        System.out.println("X axis.");
    }
}

class Jump implements ThreeDimensionalMovement{

    @Override
    public void move() {
        System.out.println("Y axis.");
    }
}

class CharacterController {
    ThreeDimensionalMovement dimensionalMovement = new ForwardBackward();
    ThreeDimensionalMovement dimensionalMovement2 = new LeftRight();
    ThreeDimensionalMovement dimensionalMovement3 = new Jump();

    public void showAvailableDirection(){
        dimensionalMovement.move();
        dimensionalMovement2.move();
        dimensionalMovement3.move();
    }
}
