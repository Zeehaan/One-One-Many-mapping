package basic.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personNo;
	private String personName;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval=true)
    private Phone phone;
}
