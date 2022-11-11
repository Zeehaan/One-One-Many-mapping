package basic.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basic.entities.Phone;

@Repository
public interface PhoneRepository  extends JpaRepository<Phone, Long>{

	Optional<Phone> findByPhoneNo(Long phoneId);

	void deleteByPhoneNo(Phone phone);

}
