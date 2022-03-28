package designPattern.behaviourDesign.observer;

public interface Publisher {
	public void attach(Subscriber subcriber);
	public void change(String message);
}
