package designPattern.structuralDesign.flyweight;

public class FlyWeightDemo {
	public static void main(String[] args) {
		Code javaCode = new Code("Java program");
		Code dotNetCode = new Code("C# program");
		Platform p = PlatformFactory.getInstance(".Net");
		p.execute(dotNetCode);
		p = PlatformFactory.getInstance("JAVA");
		p.execute(javaCode);
		p = PlatformFactory.getInstance(".Net");
		p.execute(dotNetCode);
	}
}
