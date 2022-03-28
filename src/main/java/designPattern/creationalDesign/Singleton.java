package designPattern.creationalDesign;

class Setting
{
	private static Setting instance;
	
	private Setting()
	{
	}
	
	public static Setting getSetting()
	{
		if(instance == null)
		{
			instance = new Setting();
		}
		return instance;
	}
}
public class Singleton {
			public static void main(String[] args) {
				Setting setting = Setting.getSetting();
				Setting setting1 = Setting.getSetting();
				System.out.println(setting == setting1);
			}
}
