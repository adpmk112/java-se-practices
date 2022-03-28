package designPattern.behaviourDesign.mediator;

public class ChatUser extends User{

        public ChatUser(ChatMediator mediator, String userName) {
            super(mediator, userName);
            mediator.addUser(this);
        }

        @Override
        void sendMessage(String message) {
            System.out.println(this.userName+" send message to mediator "+ message);
            mediator.sendMessage(this, message);
        }

        @Override
        void receive(String message) {
            System.out.println(this.userName+" receive message "+message);

        }
    }

