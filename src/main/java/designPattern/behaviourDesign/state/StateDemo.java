package designPattern.behaviourDesign.state;

public class StateDemo {
    public static void main(String[] args) {
        StateContext context = new StateContext(new HungryState());
        context.doAction();
        context.doAction();
        context.doAction();
    }
}
