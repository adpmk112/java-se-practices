package designPattern.behaviourDesign.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Publisher{
	List<Subscriber>subscriberList = new ArrayList<>();

	@Override
	public void attach(Subscriber subcriber) {
		// TODO Auto-generated method stub
		subscriberList.add(subcriber);
	}

	@Override
	public void change(String message) {
		// TODO Auto-generated method stub
		System.out.println("Publisher Change "+message);
		for(Subscriber sub : subscriberList)
		{
			sub.update(message);
		}
	}

}
