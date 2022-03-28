package javaSE.kmp.test;
class Product
{
    private int id;
    private String name;
    private double price;

    public void setid(int id)
    {
        this.id = id;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    public void setprice(double price)
    {
        this.price = price;
    }
    public double getprice()
    {
        return price;
    }
}

class CreditCard
{
    private double balance;

    public void setbalance(double balance)
    {
        this.balance = balance;
    }
    public double getbalance()
    {
        return balance;
    }
}

class Person1
{
    private CreditCard crdCd;
    public Person1(CreditCard crdCd)
    {
        this.crdCd = crdCd;
    }
    public void buy(Product product) throws BalanceNotEnoughException
    {
        double balance = crdCd.getbalance();
        if(balance<product.getprice())
        {
            throw new BalanceNotEnoughException("Your Balance is not Enough");
        }
        else
        {
            balance -= product.getprice();
            System.out.println("You have bought "+product.getname()+"& your remain balance is "+balance);
        }
    }
}

class BalanceNotEnoughException extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BalanceNotEnoughException(String message)
    {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Product product = new Product();
        product.setid(1);
        product.setname("Controller");
        product.setprice(30);
        
        CreditCard creditCard = new CreditCard();
        creditCard.setbalance(20);

        Person1 person1 = new Person1(creditCard);
        try
        {
            person1.buy(product);
        }
        catch(BalanceNotEnoughException e)
        {
            e.printStackTrace();
        }

    }
}
