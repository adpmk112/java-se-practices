package javaSE.kmp.test;
public class Person {
    private int id;
    private String name;
    private int age;
    
    public void SetId(int id)
    {
        this.id=id;
    }
    public int GetId()
    {
        return id;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public String GetName()
    {
        return name;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }
    public int GetAge()
    {
        return age;
    }
    public String toString()
    {
        return "Person[id="+id+", age="+age+",name="+name;
    }
}
