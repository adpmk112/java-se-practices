package projDemo.nakanoProj.Quintuplets;

import projDemo.nakanoProj.Nakano;
import projDemo.nakanoProj.Sisters;
import projDemo.nakanoProj.Subject;

public class Nino extends Nakano implements Sisters {

    private String lastname = "Nino";

    private Subject subject;
    public Nino(Subject subject){
        this.subject = subject;
    }

    public Nino()
    {

    }

    @Override
    public void showFullName() {
        System.out.println(getFirstName()+" "+lastname);
    }

    @Override
    public void hairstyle() {
        System.out.println("HairStyle --> Very long hair (later becomes short), scarlet hair color");
    }

    @Override
    public void accessories() {
        System.out.println("Accessories --> Two butterfly-shaped ribbons on both sides of her hair.");
    }

    @Override
    public void favSubject() {
        System.out.println("Fav subject --> "+subject);
    }
}
