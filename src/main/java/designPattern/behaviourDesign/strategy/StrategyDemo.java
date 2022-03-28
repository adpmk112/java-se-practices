package designPattern.behaviourDesign.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setSortStrategy(new SelectionSort());
        context.sort();
    }
}
