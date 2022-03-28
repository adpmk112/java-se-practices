package designPattern.structuralDesign.flyweight;

public class JavaPlatform implements Platform{
public JavaPlatform()
{
	System.out.println("Create Java Platform");
}
	@Override
	public void execute(Code code) {
		// TODO Auto-generated method stub
		System.out.println("Execute"+code.getCode()+"On Java");
	}

}
