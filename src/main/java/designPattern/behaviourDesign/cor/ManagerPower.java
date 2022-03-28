package designPattern.behaviourDesign.cor;

public class ManagerPower extends PurchasePower {
static final int ALLOW = BASE * 10;	 
	@Override
	void handleRequest(Command command) {
		// TODO Auto-generated method stub
    if(command.amount <= ALLOW)
    {
    	System.out.println("Sale handled by Manager");
    }
    else
    {
    	if(this.getSuccessor()!=null)
    	{
    		successor.handleRequest(command);
    	}
    }
	}

}
