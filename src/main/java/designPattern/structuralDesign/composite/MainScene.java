package designPattern.structuralDesign.composite;

public abstract class MainScene {
String name;
public MainScene(String name)
{
	this.name = name;
}
abstract void build();
}
