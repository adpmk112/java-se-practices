package designPattern.structuralDesign.adapter;

public class ClassAdapter extends OldApi implements NewApi{

	@Override
	public void receiveDamage(int damage) {
		// TODO Auto-generated method stub
		damageIn(damage);
	}
	public static void main(String[] args) {
		NewApi newApi = new ClassAdapter();
		newApi.receiveDamage(50);
	}
}
