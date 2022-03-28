package designPattern.behaviourDesign.strategy;

public class SelectionSort implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("Sorting with selection sort.");
    }
}
