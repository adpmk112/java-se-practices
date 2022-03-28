package projDemo.nakanoProj.Quintuplets;

import projDemo.nakanoProj.Nakano;
import projDemo.nakanoProj.Sisters;
import projDemo.nakanoProj.Subject;

public class Itsuki extends Nakano implements Sisters {

    private String lastName = "Itsuki";

    private Subject subject;
    public Itsuki(Subject subject){
        this.subject = subject;
    }

    public Itsuki()
    {

    }

    @Override
    public void showFullName() {
        System.out.println(getFirstName()+" "+lastName);
    }

    @Override
    public void hairstyle() {
        System.out.println("HairStyle --> Mid-back length hair, reddish orange hair color with an ahoge");
    }

    @Override
    public void accessories() {
        System.out.println("Accessories --> Two star-shaped hair clips.");
    }

    @Override
    public void favSubject() {
        System.out.println("Fav subject --> "+subject);
    }
}
