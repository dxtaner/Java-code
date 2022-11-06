package Devs.Devs.business.responses.programmingLanguageResponses;

import java.util.List;

import Devs.Devs.entities.concretes.SubTech;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrrammingLanguagesResponse {

	private int programmingLanguageId;
	private String programmingLanguageName;
	private List<SubTech> subTechs;

}
