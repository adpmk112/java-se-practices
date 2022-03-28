package javaSE.kmp.innerClasses;

class View
{
	private OnClickListener onClickListener;
	
	interface OnClickListener
	{
		void onClick();
	}
	
	void SetOnClickListener(OnClickListener onClickListener)
	{
		this.onClickListener = onClickListener;
	}
}

class TextView extends View
{
	public void SetText(String text)
	{
		System.out.println(text);
	}
}

class Button extends TextView
{
	
}

class Activitiy
{
	View.OnClickListener listener;
	public void OnCreate()
	{
		Button btn = new Button();
		btn.SetText("Login");
		btn.SetOnClickListener(listener = new View.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Login btn is clicked!");
			}
		});
	}
	public void onClickLoginBtn()
	{
		listener.onClick();
	}
}

public class AnonymousClassTest
{
	public static void main(String[] args) {
		Activitiy activity = new Activitiy();
		activity.OnCreate();
		activity.onClickLoginBtn();
	}
}