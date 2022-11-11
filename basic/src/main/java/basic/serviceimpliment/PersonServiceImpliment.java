package basic.serviceimpliment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.entities.Person;
import basic.repositories.PersonRepositories;
import basic.service.PersonService;

@Service
public class PersonServiceImpliment implements PersonService {

	@Autowired
	private PersonRepositories personRepositories;
	
	
	@Override
	public Person createPerson(Person person) {
	return 	personRepositories.save(person);		
	}
	@Override
	public Person getPersonById(Long personId) {
		return personRepositories.findById(personId).get();		
	}
	@Override
	public List<Person> getAll() {
	return	personRepositories.findAll();		
	}
	
	@Override
	public void deletePersonById(Long personId) {		
		Person person = personRepositories.findById(personId).get();
		personRepositories.delete(person);
	}
	@Override
	public Person updatePerson(Long personId, Person person) {
	Person personNew = personRepositories.findById(personId).get();
		person=personNew;
		personRepositories.save(person);
		return person;
	}
	
	

}
