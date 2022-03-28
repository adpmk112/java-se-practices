package designPattern.behaviourDesign.observer;

public class Demo {
public static void main(String[] args) {
	Publisher dataSource = new DataSource();
	View view1 = new View("View1");
	View view2 = new View("View2"); 
	View view3 = new View("View3");
	dataSource.attach(view1);
	dataSource.attach(view2);
	dataSource.attach(view3);
	dataSource.change("Change1");
	dataSource.change("Change2");
}
}
