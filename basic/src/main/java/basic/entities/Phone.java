package basic.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJndi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long phoneNo;
	private String phoneName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contacts> contacts;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Person person;
}
