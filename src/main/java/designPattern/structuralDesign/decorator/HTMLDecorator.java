package designPattern.structuralDesign.decorator;

public class HTMLDecorator implements Logger {

	Logger logger;
	public HTMLDecorator(Logger logger)
	{
		this.logger = logger;
	}
	@Override
	public String log(String msg) {
		// TODO Auto-generated method stub
		return "<html>"+logger.log(msg)+"</html>";
	}
}
