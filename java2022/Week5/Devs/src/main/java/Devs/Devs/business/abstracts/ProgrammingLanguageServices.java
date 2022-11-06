package Devs.Devs.business.abstracts;

import java.util.List;

import Devs.Devs.business.requests.programmingLanguageRequests.CreateProgrammingLanguageRequest;
import Devs.Devs.business.requests.programmingLanguageRequests.UpdateProgrammingLanguageRequest;
import Devs.Devs.business.responses.programmingLanguageResponses.GetAllProgrrammingLanguagesResponse;
import Devs.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageServices {
	List<GetAllProgrrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	ProgrammingLanguage getById(int id);
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
	void delete(int id) throws Exception;
}
