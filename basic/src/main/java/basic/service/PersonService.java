package basic.service;

import java.util.List;

import basic.entities.Person;

public interface PersonService {
	Person createPerson(Person person);
	Person getPersonById(Long personId);
	List<Person> getAll();	
	void deletePersonById(Long personId);
	Person updatePerson(Long personId, Person person);
}
