package designPatternTest.behaviourDesign;

public class CorTest {
    public static void main(String[] args) {
        BuyAmount buyAmount = new BuyAmount(1000);
        AmountHandler store = new Store();
        AmountHandler agentStore = new AgentStore();
        AmountHandler company = new Company();

        store.setHandler(agentStore);
        agentStore.setHandler(company);

        store.handleAmount(buyAmount);
    }
}

class BuyAmount{
    int totalAmount;
    public BuyAmount(int amount){
        this.totalAmount = amount;
    }
}
abstract class AmountHandler{
    static final int baseAmount = 1;

    abstract void handleAmount(BuyAmount amount);

    AmountHandler handler;

    public void setHandler(AmountHandler handler){
        this.handler = handler;
    }

    public AmountHandler getHandler(){
        return handler;
    }
}

class Store extends AmountHandler{

    static final int allowedAmount = baseAmount * 100;

    @Override
    void handleAmount(BuyAmount amount) {
        if (amount.totalAmount <= allowedAmount){
            System.out.println("Purchased at store");
        }
        else {
            if(this.getHandler() != null)
            {
                handler.handleAmount(amount);
            }
        }
    }
}

class AgentStore extends AmountHandler{

    static final int allowedAmount = baseAmount * 1000;

    @Override
    void handleAmount(BuyAmount amount) {
        if (amount.totalAmount <= allowedAmount){
            System.out.println("Purchased at AgentStore");
        }
        else {
            if(this.getHandler() != null)
            {
                handler.handleAmount(amount);
            }
        }
    }
}

class Company extends AmountHandler{

    static final int allowedAmount = baseAmount * 100000;

    @Override
    void handleAmount(BuyAmount amount) {
        if(amount.totalAmount <= allowedAmount){
            System.out.println("Purchased at Company");
        }
        else
        {
            if(this.getHandler() != null){
                handler.handleAmount(amount);
            }
        }
    }
}


