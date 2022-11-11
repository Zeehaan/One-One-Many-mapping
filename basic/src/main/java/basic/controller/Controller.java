package basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import basic.entities.Contacts;
import basic.entities.Person;
import basic.entities.Phone;
import basic.service.ContactService;
import basic.service.PersonService;
import basic.service.PhoneService;

@RestController
public class Controller {
	@Autowired
	private PersonService personService;
	@Autowired
	private PhoneService phoneService;
	@Autowired
	private ContactService contactService;

	@GetMapping("/all")
	public List<Person> getAll() {
		return personService.getAll();
	}

	@PostMapping("/add-person")
	public Person addPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}

	@GetMapping("/get-person/{personId}")
	public Person getPerson(@PathVariable(value = "personId") Long personId) {
		return personService.getPersonById(personId);
	}

	@GetMapping("/get-phone/{phoneId}")
	public Phone getPhone(@PathVariable(value = "phoneId") Long phoneId) {
		return phoneService.getPhoneById(phoneId);
	}

	@GetMapping("/get-contact/{contactId}")
	public Contacts getContact(@PathVariable(value = "contactId") Long contactId) {
		return contactService.getContactById(contactId);
	}
	@DeleteMapping("/delete-person/{personId}")
	public void deletePersonById(@PathVariable(value = "personId") Long personId) {
		personService.deletePersonById(personId);
	}

//	@DeleteMapping("/delete-phone/{phoneId}")
//	public void deletePhoneById(@PathVariable(value = "phoneId") Long phoneId) {
//		 phoneService.deleteByPhoneId(phoneId);
//	}
//
//
//
//	@DeleteMapping("/delete-contact/{contactId}")
//	public void deleteContactById(@PathVariable(value = "contactId") Long contactId) {
//		contactService.deleteContactById(contactId);
//	}
	
	@PutMapping("update-person/{personId}")
	public Person updatePerson(@PathVariable(value="personId") Long personId,@RequestBody Person person) {
		return  personService.updatePerson(personId,person);
	}

}
