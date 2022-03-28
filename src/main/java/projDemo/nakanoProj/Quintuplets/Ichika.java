package projDemo.nakanoProj.Quintuplets;

import projDemo.nakanoProj.Sisters;
import projDemo.nakanoProj.Nakano;
import projDemo.nakanoProj.Subject;

public class Ichika extends Nakano implements Sisters {

    private String lastName = "Ichika";

    private Subject subject;
    public Ichika(Subject subject){
        this.subject = subject;
    }

    public Ichika()
    {

    }

    @Override
    public void showFullName(){
        System.out.println(getFirstName()+" "+lastName);
    }

    @Override
    public void hairstyle() {
        System.out.println( "HairStyle--> Short hair,Light-pink hair color");
    }

    @Override
    public void accessories() {
        System.out.println("Accessories--> An earring in her right ear.");
    }

    @Override
    public void favSubject() {
        System.out.println("Fav subject --> "+subject);
    }
}
