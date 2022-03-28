package designPattern.behaviourDesign.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public static void main(String[] args) {
        List<Memento> savedState = new ArrayList<>();
        Originator originator = new Originator();

        originator.setState("State1");
        originator.setState("State2");
        originator.setState("State3");

        savedState.add(originator.saveToMemento());

        originator.setState("State4");
        originator.restoreFromMemento(savedState.get(0));
        System.out.println("Original State "+originator.state);


    }
}
