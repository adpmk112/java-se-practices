package javaSE.kmp.testingHibernate.dataTransferObj;

import javaSE.kmp.testingHibernate.entity.BaseEntity;
import javaSE.kmp.testingHibernate.entity.FullName;
import javaSE.kmp.testingHibernate.entity.Laptop;
import javaSE.kmp.testingHibernate.entity.Person;
import lombok.Getter;
import lombok.Setter;

//Entity>Dto>Dao
//Dao>Dto>Entity
@Getter
@Setter

public class PersonDto extends BaseEntity<Long> {
    private int age;
    private Laptop laptop;
    private String firstname,lastname;

    public PersonDto(Person person){
        super.setId(person.getId());
        this.firstname = person.getFullName().getFirstName();
        this.lastname = person.getFullName().getLastName();
        this.age = person.getAge();
        this.laptop = person.getLaptop();
    }

    public Person getEntity(){
        Person prn = new Person();
        prn.setId(super.getId());
        prn.setFullName(new FullName(this.firstname,this.lastname));
        prn.setAge(this.age);
        prn.setLaptop(this.laptop);
        return prn;
    }
}
