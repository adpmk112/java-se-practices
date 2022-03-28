package designPattern.structuralDesign.proxy;

public class CommandExecutorProxy implements CommandExecutor {
private boolean isAdmin;
private CommandExecutor executor;

public CommandExecutorProxy(String user,String pwd)
{
	if("admin".equals(user) && "admin".equals(pwd))
	{
		isAdmin = true;
	}
	executor = new CommandExecutorImpl();
}
	@Override
	public void runCommand(String command) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin)
		{
			executor.runCommand(command);
		}
		else
		{
			if(command.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executor.runCommand(command);
			}
		}
	}
}
