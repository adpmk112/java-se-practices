package designPattern.behaviourDesign.state;

public class FullState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("I am full");
    }
}
