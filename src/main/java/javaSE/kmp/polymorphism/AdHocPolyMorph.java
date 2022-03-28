package javaSE.kmp.polymorphism;
enum Ability
{
    PopQueens,BalladQueens,DanceQueens,SecondGeneration
}

interface KpopGirlGroup
{
    void Perform(Ability ability1,Ability ability2);
} 

class Apink implements KpopGirlGroup
{
    public void Perform(Ability ability1,Ability ability2)
    {
        System.out.println("Apink --> "+ability1+" & "+ability2);
    }
}

class Gfriend implements KpopGirlGroup
{
    public void Perform(Ability gfAbility1,Ability gfAbility2)
    {
        System.out.println("Gfriend --> "+gfAbility1+" & " +gfAbility2);
    }
}
public class AdHocPolyMorph {
    public static void main(String[] args) {
        KpopGirlGroup kpopGirlGroup1 = new Apink();
        kpopGirlGroup1.Perform(Ability.PopQueens, Ability.SecondGeneration);
        KpopGirlGroup kpopGirlGroup2 = new Gfriend();
        kpopGirlGroup2.Perform(Ability.DanceQueens, Ability.BalladQueens);
    }
}
