package designPattern.behaviourDesign.templete;

public class TempleteDemo {
    public static void main(String[] args) {
        FrameWorkAction frameWorkAction = new SaleAction();
        frameWorkAction.process();
    }
}
