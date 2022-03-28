package designPatternTest.behaviourDesign;

public class StateTest {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setBalance(5);

        Game game = new Game();
        game.setName("HollowKnight");
        game.setPrice(4.99);

        StateContext context = new StateContext(new AddToCartState(game),wallet);
        context.doAction();
        context.doAction();
    }
}

interface State{
    void doAction(StateContext stateContext,Wallet wallet);
}

class Wallet{
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class StateContext{
    State currentState;
    Wallet wallet;

    public StateContext(State state,Wallet wallet){
        this.currentState = state;
        this.wallet = wallet;
    }

    public void setNewState(State newState){
        this.currentState = newState;
    }

    public void doAction(){
        this.currentState.doAction(this,wallet);
    }
}

class Game{

    String name;
    double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class AddToCartState implements State{

    private Game game;

    public AddToCartState(Game game){
        this.game = game;
    }

    @Override
    public void doAction(StateContext stateContext, Wallet wallet) {
        if(this.game.getPrice()< wallet.getBalance()){
            wallet.setBalance(wallet.getBalance()-this.game.getPrice());
            System.out.println(this.game.getName()+" is added to cart.");
        }
        stateContext.setNewState(new ThankYouState());
    }
}

class ThankYouState implements State{

    Wallet wallet;

    @Override
    public void doAction(StateContext stateContext, Wallet wallet) {
        System.out.println("Thanks for your purchase. Your balance is now "+wallet.getBalance());
    }
}
