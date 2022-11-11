package basic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Contacts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contactNo;
	private String contactName;
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Phone phone;

}
