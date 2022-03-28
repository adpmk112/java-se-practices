package designPattern.behaviourDesign.mediator;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(User user,String message);
}
