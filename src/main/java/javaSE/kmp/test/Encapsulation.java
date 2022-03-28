package javaSE.kmp.test;
public class Encapsulation {
        public static void main(String[] args) {
            TextView textview = new TextView();
            textview.setText("Hello");
            System.out.println(textview.getText());
        }    
}
class TextView
{
    private String text;
    
    public void setText(String text)
    {
        this.text = text;
    }
    
    public String getText()
    {
        return text;
    }
}

