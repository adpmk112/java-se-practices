package projDemo.nakanoProj.Quintuplets;

import projDemo.nakanoProj.Nakano;
import projDemo.nakanoProj.Sisters;
import projDemo.nakanoProj.Subject;

public class Miku extends Nakano implements Sisters {

    private String lastname = "Miku";

    private Subject subject;
    public Miku(Subject subject){
        this.subject = subject;
    }

    public Miku()
    {

    }

    @Override
    public void showFullName() {
        System.out.println(getFirstName()+" "+lastname);
    }

    @Override
    public void hairstyle() {
        System.out.println("HairStyle --> Medium-length hair, brownish hair color");
    }

    @Override
    public void accessories() {
        System.out.println("Accessories --> Wireless headphones.");
    }

    @Override
    public void favSubject() {
        System.out.println("Fav subject --> "+subject);
    }
}
