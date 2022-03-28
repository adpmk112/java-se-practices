package designPattern.behaviourDesign.command;

public class CommandDemo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command copy = new CopyCommand();
        invoker.invoke(copy);
        Command paste = new PasteCommand();
        invoker.invoke(paste);
         invoker.undo();
        invoker.undo();
    }
}
