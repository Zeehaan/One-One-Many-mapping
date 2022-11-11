package basic.serviceimpliment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.entities.Phone;
import basic.repositories.PhoneRepository;
import basic.service.PhoneService;

@Service
public class PhoneServiceImpliment implements PhoneService {
	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	public Phone getPhoneById(Long phoneId) {
		return phoneRepository.findByPhoneNo(phoneId).get();
	}

//	@Override
//	public void deleteByPhoneId(Long phoneId) {
//		Phone phone = phoneRepository.findByPhoneNo(phoneId).get();
//		phoneRepository.deleteByPhoneNo(phone);
//	}


}
