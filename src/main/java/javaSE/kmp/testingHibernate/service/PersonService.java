package javaSE.kmp.testingHibernate.service;

import javaSE.kmp.testingHibernate.dataAccessObj.AbstractDao;
import javaSE.kmp.testingHibernate.dataTransferObj.PersonDto;

public interface PersonService extends AbstractDao<PersonDto,Long> {
}
