package javaSE.kmp.test;
class DataNum
{
    enum Apink
    {
        eunji,bomi,chorong
    }
    public void setMember(Apink apink)
    {
        if(apink == Apink.eunji)
        {
            System.out.println("Meung");
        }
        else if(apink == Apink.bomi)
        {
            System.out.println("Bom bom bom");
        }
        else
        {
            System.out.println("Mama Rong");
        }
    }
    String name;
    public static void setName(String name)
    {
        System.out.println("I am "+name); 
    }
    public static void main(String[] args) {
        DataNum dataNum = new DataNum();
        dataNum.setMember(Apink.chorong);
        setName("pmk");
    }
}