package Devs.Devs.business.abstracts;

import java.util.List;

import Devs.Devs.business.requests.CreateProgrammingLanguageRequest;
import Devs.Devs.business.responses.GetAllProgrrammingLanguagesResponse;
import Devs.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageServices {
	List<GetAllProgrrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	void update(String name,int id) throws Exception;
	void delete(int id) throws Exception;
	ProgrammingLanguage getById(int id);
}
