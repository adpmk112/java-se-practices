package javaSE.kmp.test;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
     /*   File file = new File("C:\\Users\\PMK\\Desktop\\pmk.txt");
          FileReader fr = new FileReader(file);
          BufferedReader br = new BufferedReader(fr);
          String temp = "";
          while ((temp=br.readLine()) != null) {
            System.out.println(temp);
          }   */

     /*   String password = "^[a-zA-Z\\d[\\$!@#%\\^]]{0,8}$";
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher("Asdf111^");
        System.out.println(matcher.matches());  */

        HashMap<String,String>stringHashMap = new HashMap<>();
        stringHashMap.put("111","LuPyae");
        //System.out.println(stringHashMap.get("111"));

        for(Map.Entry<String,String> out: stringHashMap.entrySet() )
        {
            System.out.println("Key --> "+out.getKey()+" Value = "+out.getValue());
        }

        List<BlendS>members = new ArrayList<>();
        members.add(new BlendS("Manager"));
        members.add(new BlendS("Maika"));
        members.add(new BlendS("Kaho"));
        members.add(new BlendS("Mafuyu"));
        members.add(new BlendS("Tanjiro"));

        Iterator<BlendS>membersIterator = members.iterator();
       /* while(membersIterator.hasNext())
        {
            if(membersIterator.next().getName().equals("Tanjiro")) {
               membersIterator.remove();
            }
        }   */

        while(membersIterator.hasNext())
        {
            BlendS blendS = membersIterator.next();

            if(blendS.equals("Tanjiro"))
            {
                blendS.setName("Akizuki");
            }
        }

        for (BlendS blendS : members)
        {
            System.out.println(blendS.getName());
        }
    }
}

class BlendS
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BlendS(String name) {
        this.name = name;
    }
}
