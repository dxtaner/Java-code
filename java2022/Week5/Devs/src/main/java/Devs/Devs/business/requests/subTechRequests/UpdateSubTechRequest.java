package Devs.Devs.business.requests.subTechRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSubTechRequest {
	private int subTechId;
	private String subTechName;
	private int programmingLanguageId;

}
