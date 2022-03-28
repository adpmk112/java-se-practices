package designPattern.structuralDesign.proxy;

public class ProxyDemo {
public static void main(String[] args) {
	CommandExecutor command = new CommandExecutorProxy("admin","admin");
	try {
		command.runCommand("notepad.exe");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	command = new CommandExecutorProxy("user","user");
	try {
		command.runCommand("rm");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
