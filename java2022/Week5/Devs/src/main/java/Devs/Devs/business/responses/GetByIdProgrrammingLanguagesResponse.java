package Devs.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrrammingLanguagesResponse {

	private int programmingLanguageId;
	private String programmingLanguageName;
}
