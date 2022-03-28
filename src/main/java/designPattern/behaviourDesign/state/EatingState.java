package designPattern.behaviourDesign.state;

public class EatingState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("I am Eating");
        context.changeState(new FullState());
    }
}
