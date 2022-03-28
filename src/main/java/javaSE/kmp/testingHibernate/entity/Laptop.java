package javaSE.kmp.testingHibernate.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

@Getter
@Setter
public class Laptop extends BaseEntity<Long> {

    @Column(name = "brand",length = 20)
    private String brand;

    @Column(name = "description",length = 500)
    private String description;

    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    @OneToOne(mappedBy = "laptop")
    private Person person;
}
