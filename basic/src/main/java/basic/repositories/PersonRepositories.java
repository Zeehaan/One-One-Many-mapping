package basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basic.entities.Person;

@Repository
public interface PersonRepositories extends JpaRepository<Person, Long> {

}
