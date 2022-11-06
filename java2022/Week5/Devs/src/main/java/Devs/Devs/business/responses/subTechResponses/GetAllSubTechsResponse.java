package Devs.Devs.business.responses.subTechResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubTechsResponse {
	
	private int subTechId;
	private String subTechName;
	private int programmingLanguageId;

}
