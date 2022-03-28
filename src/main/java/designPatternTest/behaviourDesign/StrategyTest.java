package designPatternTest.behaviourDesign;

public class StrategyTest {
    public static void main(String[] args) {
        Movement movement = new VeloctiyMovement();

        MovementContext movementContext = new MovementContext();
        movementContext.setMovement(movement);
        movementContext.move();
    }
}

interface Movement{
    void move();
}

class VeloctiyMovement implements Movement{

    @Override
    public void move() {
        System.out.println("Move with Velocity");
    }
}

class ForceMovement implements Movement{

    @Override
    public void move() {
        System.out.println("Move with Force");
    }
}

class MovementContext{
    Movement movement;

    public void setMovement(Movement movement){
        this.movement = movement;
    }

    public Movement getMovement(){
        return movement;
    }

    public void move(){
        this.movement.move();
    }
}
