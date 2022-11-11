package basic.serviceimpliment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.entities.Contacts;
import basic.repositories.ContactRepository;
import basic.service.ContactService;

@Service
public class ContactServiceImpliment implements ContactService {
	@Autowired
	private ContactRepository contactRepository;
	@Override
	public Contacts getContactById(Long contactId) {	
		return contactRepository.findByContactNo(contactId).get();
	}
//	@Override
//	public void deleteContactById(Long contactId) {
//		//Contacts contact = contactRepository.findByContactNo(contactId).get();
//		contactRepository.deleteById(contactId);			
//	}

}
