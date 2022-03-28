package designPattern.behaviourDesign.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for(User u : this.userList){
            if(u != user){
                u.receive(message);
            }
        }
    }
}
