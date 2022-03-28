package designPattern.behaviourDesign.templete;

public abstract class FrameWorkAction {
    private void auth(){
        System.out.println("Authentication");
    }

    private void logging(){
        System.out.println("Logging");
    }

    protected abstract void businessLogic();

    protected void process(){
        this.auth();
        this.businessLogic();
        this.logging();
    }
}
