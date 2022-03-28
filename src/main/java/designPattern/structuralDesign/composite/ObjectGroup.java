package designPattern.structuralDesign.composite;

import java.util.ArrayList;
import java.util.List;

public class ObjectGroup extends MainScene {
	List<MainScene> childrenObjects = new ArrayList<>();

	public ObjectGroup(String name) {
		super(name);
	}

	@Override
	void build() {
		System.out.println(this.name + " is built.");
		for (MainScene childObject : this.childrenObjects) {
			childObject.build();
		}
	}

	public void add(MainScene childObject) {
		this.childrenObjects.add(childObject);
	}
}
