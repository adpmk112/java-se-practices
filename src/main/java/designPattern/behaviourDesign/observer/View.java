package designPattern.behaviourDesign.observer;

public class View implements Subscriber {
String viewName;
public View(String viewName)
{
	this.viewName = viewName;
}
@Override
public void update(String message) {
	// TODO Auto-generated method stub
	System.out.println("View "+viewName+" Update to "+message);
}
}
