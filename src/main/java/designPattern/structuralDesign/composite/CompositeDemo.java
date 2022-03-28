package designPattern.structuralDesign.composite;

public class CompositeDemo {
	public static void main(String[] args) {
		ObjectGroup objectGroup = new ObjectGroup("3D GameWorld");
		GameObject gameObject1 = new GameObject("Main Camera");
		GameObject gameObject2 = new GameObject("Plane");

		objectGroup.add(gameObject1);
		objectGroup.add(gameObject2);

		ObjectGroup objectGroup2 = new ObjectGroup("Boundary");
		objectGroup2.add(new GameObject("Wall"));

		objectGroup.add(objectGroup2);
		objectGroup.build();
	}
}
