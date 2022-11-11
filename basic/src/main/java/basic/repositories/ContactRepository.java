package basic.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basic.entities.Contacts;

@Repository
public interface ContactRepository  extends JpaRepository<Contacts, Long>{

	Optional<Contacts> findByContactNo(Long contactId);
	void deleteByContactNo(Long contactNo);

}
