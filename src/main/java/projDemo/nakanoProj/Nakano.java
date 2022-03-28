package projDemo.nakanoProj;

import lombok.Getter;

@Getter
public class Nakano {
   protected final String height = "Average height";
   protected final String eyes = "Large and dark-blue eyes";
   private static String firstName = "Nakano";

   public static String getFirstName()
   {
      return firstName;
   }
}

