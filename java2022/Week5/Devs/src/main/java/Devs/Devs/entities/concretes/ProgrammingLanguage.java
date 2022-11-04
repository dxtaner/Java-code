package Devs.Devs.entities.concretes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "programminglanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="programmingLanguageId")
	private int programmingLanguageId;
	
	@Column(name="programmingLanguageName")
	private String programmingLanguageName;

	@OneToMany(mappedBy = "programminglanguage")
	private Set<SubTech> subTech;
	
}
