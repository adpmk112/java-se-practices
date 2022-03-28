package designPattern.behaviourDesign.mediator;

public abstract class User {
        String userName;
        ChatMediator mediator;

        public User(ChatMediator mediator,String userName) {
            this.mediator = mediator;
            this.userName = userName;
        }
        abstract void sendMessage(String message);
        abstract void receive(String message);
    }

