package solidPrinciple;
interface IWorkable
{
    public void work();
}
interface Ifeedable
{
    public void eat();
}
class Worker implements IWorkable,Ifeedable
{
    @Override
    public void work()
    {
        System.out.println("Worker is working");
    }
    
    @Override
    public void eat()
    {
        System.out.println("Worker is eating");
    }
}
class Robot implements IWorkable
{
    @Override
    public void work()
    {
        System.out.println("Robot is working");
    }
}