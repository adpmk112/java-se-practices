package projDemo.nakanoProj.Quintuplets;

import projDemo.nakanoProj.Nakano;
import projDemo.nakanoProj.Sisters;
import projDemo.nakanoProj.Subject;

public class Yotsuba extends Nakano implements Sisters {

    private String lastname = "Yotsuba";

    private Subject subject;
    public Yotsuba(Subject subject){
        this.subject = subject;
    }

    public Yotsuba()
    {

    }

    @Override
    public void showFullName() {
        System.out.println(getFirstName()+" "+lastname);
    }

    @Override
    public void hairstyle() {
        System.out.println("HairStyle --> Short hair, light orange hair color");
    }

    @Override
    public void accessories() {
        System.out.println("Accessories --> A green ribbon");
    }

    @Override
    public void favSubject() {
        System.out.println("Fav subject --> "+subject);
    }
}
