package designPattern.behaviourDesign.cor;

public class VicePresidentPower extends PurchasePower {
static final int ALLOW = BASE * 30;
	@Override
	void handleRequest(Command command) {
		// TODO Auto-generated method stub
		if(command.amount <= ALLOW)
		{
			System.out.println("Sale handled by VicePresident");
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
