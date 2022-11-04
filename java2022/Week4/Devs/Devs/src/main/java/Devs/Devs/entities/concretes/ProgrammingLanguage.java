package Devs.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Table(name="pprogrammingLanguage")
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
	
	
}
