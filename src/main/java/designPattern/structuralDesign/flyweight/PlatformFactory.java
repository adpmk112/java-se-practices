package designPattern.structuralDesign.flyweight;

import java.util.Map;
import java.util.HashMap;

public class PlatformFactory {
private static Map<String,Platform>map = new HashMap<>();
public static Platform getInstance(String platformType)
{
	Platform p = map.get(platformType);
	if(p==null)
	{
		switch(platformType)
		{
			case ".Net" :
			p = new DotNetPlatform();
			break;
			case "JAVA":
			p = new JavaPlatform();
			break;
		}
		map.put(platformType, p);
	}
	return p;
}
}
