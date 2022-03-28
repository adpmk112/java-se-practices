package designPattern.behaviourDesign.state;

public class HungryState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("I am hungry.");
        context.changeState(new EatingState());
    }
}
