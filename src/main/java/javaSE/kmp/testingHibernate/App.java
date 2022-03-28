package javaSE.kmp.testingHibernate;

import javaSE.kmp.testingHibernate.controller.LaptopController;
import javaSE.kmp.testingHibernate.controller.LaptopControllerImpl;
import javaSE.kmp.testingHibernate.controller.PersonController;
import javaSE.kmp.testingHibernate.controller.PersonControllerImpl;
import javaSE.kmp.testingHibernate.dataAccessObj.LaptopDaoImpl;
import javaSE.kmp.testingHibernate.dataAccessObj.PersonDaoImpl;
import javaSE.kmp.testingHibernate.entity.FullName;
import javaSE.kmp.testingHibernate.entity.Laptop;
import javaSE.kmp.testingHibernate.entity.Person;
import javaSE.kmp.testingHibernate.respository.LaptopRepository;
import javaSE.kmp.testingHibernate.respository.PersonRespository;
import javaSE.kmp.testingHibernate.service.LaptopService;
import javaSE.kmp.testingHibernate.service.LaptopServiceImpl;
import javaSE.kmp.testingHibernate.service.PersonService;
import javaSE.kmp.testingHibernate.service.PersonServiceImpl;

public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setBrand("Dell");
		laptop.setDescription("This is i3");

		Person prn = new Person();
		prn.setFullName(new FullName("Lu","Pyae"));
		prn.setAge(22);
		prn.setLaptop(laptop);

		Person prn1 = new Person();
		prn1.setFullName(new FullName("Bro","AyeChan"));
		prn1.setAge(25);
		prn1.setLaptop(laptop);

		PersonRespository prnRepo = new PersonDaoImpl();
		PersonService personService = new PersonServiceImpl(prnRepo);
		PersonController personController = new PersonControllerImpl(personService);

		//personController.save(prn);
		//personController.save(prn1);

		Person person = personController.findById(1L);
		personController.printDetails(person);
		personController.delete(person);

	//	personController.delete(person);

	/*	List<Person>people = personController.findAll();
		personController.printDetails(people);  */

		LaptopRepository lpRepo = new LaptopDaoImpl();
		LaptopService laptopService = new LaptopServiceImpl(lpRepo);
        LaptopController laptopController = new LaptopControllerImpl(laptopService);

        //laptopController.save(laptop);

    /*  List<Laptop>laptops = laptopController.findAll();
        laptopController.printDetails(laptops); */

        Laptop laptop1 = laptopController.findById(2L);
        laptopController.printDetails(laptop1);

	/*	laptop1.setId(laptop1.getId());
		person.setLaptop(laptop1);
		personController.update(person);

		personController.findById(2L);
		personController.printDetails(person); */

	//	laptop1.setBrand("Lenovo");
	//	laptopService.update(new LaptopDto(laptop1));
	}
}
