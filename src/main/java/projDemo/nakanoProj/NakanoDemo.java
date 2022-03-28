package projDemo.nakanoProj;

import projDemo.nakanoProj.Quintuplets.Ichika;
import projDemo.nakanoProj.Quintuplets.Nino;
import projDemo.nakanoProj.Quintuplets.Miku;
import projDemo.nakanoProj.Quintuplets.Yotsuba;
import projDemo.nakanoProj.Quintuplets.Itsuki;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NakanoDemo {
    public static void main(String[] args) {
        String name = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Type something you want to know !");

        try {
             name = scan.nextLine().toLowerCase(Locale.ROOT);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        switch (name) {
            case "ichika":
                Sisters ichika = new Ichika(Subject.MATHS);
                ichika.showFullName();
                ichika.hairstyle();
                ichika.accessories();
                ichika.favSubject();
                break;

            case "nino":
                Sisters nino = new Nino(Subject.ENGLISH);
                nino.showFullName();
                nino.hairstyle();
                nino.accessories();
                nino.favSubject();
                break;

            case "miku":
                Sisters miku = new Miku(Subject.SOCIALSTUDIES);
                miku.showFullName();
                miku.hairstyle();
                miku.accessories();
                miku.favSubject();
                break;

            case "yotsuba":
                Sisters yotsuba = new Yotsuba(Subject.JAPANESE);
                yotsuba.showFullName();
                yotsuba.hairstyle();
                yotsuba.accessories();
                yotsuba.favSubject();
                break;

            case "itsuki":
                Sisters itsuki = new Itsuki(Subject.SCIENCE);
                itsuki.showFullName();
                itsuki.hairstyle();
                itsuki.accessories();
                itsuki.favSubject();
                break;

            case "all name":
                Sisters ichika1 = new Ichika();
                Sisters nino1 = new Nino();
                Sisters miku1 = new Miku();
                Sisters yotsuba1 = new Yotsuba();
                Sisters itsuki1 = new Itsuki();

                List<Sisters>sistersList = new ArrayList<>();
                sistersList.add(ichika1);
                sistersList.add(nino1);
                sistersList.add(miku1);
                sistersList.add(yotsuba1);
                sistersList.add(itsuki1);

                for(Sisters sisters:sistersList)
                {
                    sisters.showFullName();
                }

                break;

            default:
                System.out.println("Non of them!");

            scan.close();
        }


    }
}
