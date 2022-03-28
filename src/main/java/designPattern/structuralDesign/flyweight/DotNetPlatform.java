package designPattern.structuralDesign.flyweight;

public class DotNetPlatform implements Platform{
public DotNetPlatform()
{
	System.out.println("Create .net platform");
}

@Override
public void execute(Code code) {
	// TODO Auto-generated method stub
	System.out.println("Execute Code "+code.getCode()+" on DotNet ");
}
}
