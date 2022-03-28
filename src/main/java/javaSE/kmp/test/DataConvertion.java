package javaSE.kmp.test;

public class DataConvertion {
    public static void main(String[] args) {
     String value = "12";
     try
     {
     int a = Integer.parseInt(value);
     System.out.println(a);
    }
    catch(NumberFormatException e)
    {
        e.printStackTrace();
    }
    try
    {
        Integer b = Integer.valueOf(value);
        System.out.println(b);
    }
    catch(NumberFormatException e)
    {
        e.printStackTrace();
    }
    String pname = "1#PMK#20";
    String[]data=pname.split("#");
    Person obj = new Person();
    obj.SetId(Integer.parseInt(data[0]));
    obj.SetName(data[1]);
    obj.SetAge(Integer.parseInt(data[2]));
    System.out.println(obj.toString());
}
}
