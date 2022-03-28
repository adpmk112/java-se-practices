package javaSE.kmp.testingHibernate.view;

import javaSE.kmp.testingHibernate.entity.Person;

public class PersonView extends AbstractViewImpl<Person>{
    @Override
    public void printDetails(Person model) {
        StringBuilder sb = new StringBuilder();
        sb.append("Person id = ");
        sb.append(model.getId());
        sb.append(", Person name = ");
        sb.append(model.getFullName().getFirstName()+" ");
        sb.append(model.getFullName().getLastName());
        sb.append(", laptop id = ");
        try{
            sb.append(model.getLaptop().getId());
        }
        catch(NullPointerException exception){
             sb.append("No laptop!");
        }
        finally {
            System.out.println(sb.toString());
        }
    }
}
