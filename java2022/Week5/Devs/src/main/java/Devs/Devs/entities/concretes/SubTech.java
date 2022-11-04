package Devs.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "subtech")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubTech {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subTechId")
	private int subTechId;
	
	@Column(name="subTechName")
	private String subTechName;
	
	@ManyToOne
	@JoinColumn(name="programmingLanguageId")
	private ProgrammingLanguage programmingLanguage;
}
