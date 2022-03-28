package designPattern.behaviourDesign.command;

public class CopyCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Copy Executed");
    }
}
