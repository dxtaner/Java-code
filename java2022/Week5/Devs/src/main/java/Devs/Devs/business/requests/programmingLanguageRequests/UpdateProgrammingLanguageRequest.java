package Devs.Devs.business.requests.programmingLanguageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProgrammingLanguageRequest {
	
	private int programmingLanguageId;
	private String programmingLanguageName;

}
