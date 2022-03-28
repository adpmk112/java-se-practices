package designPattern.structuralDesign.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String command) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(command);
		System.out.println(""+command+" command executed");
	}
}
