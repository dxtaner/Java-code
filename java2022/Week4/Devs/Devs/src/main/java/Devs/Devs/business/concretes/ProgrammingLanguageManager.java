package Devs.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Devs.Devs.business.abstracts.ProgrammingLanguageServices;
import Devs.Devs.business.requests.CreateProgrammingLanguageRequest;
import Devs.Devs.business.responses.GetAllProgrrammingLanguagesResponse;
import Devs.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Devs.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageServices{
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository ProgrammingLanguageRepository) {
		super();
		this.programmingLanguageRepository = ProgrammingLanguageRepository;
	}

	@Override
	public List<GetAllProgrrammingLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrrammingLanguagesResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			
			GetAllProgrrammingLanguagesResponse responseItem = new GetAllProgrrammingLanguagesResponse();
			responseItem.setProgrammingLanguageId(programmingLanguage.getProgrammingLanguageId());
			responseItem.setProgrammingLanguageName(programmingLanguage.getProgrammingLanguageName());
			
			programmingLanguagesResponse.add(responseItem);
		}
		return programmingLanguagesResponse;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.findAll()) {
			if(programmingLanguage.getProgrammingLanguageId()==id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		 if(createProgrammingLanguageRequest.getProgrammingLanguageName().isEmpty() || createProgrammingLanguageRequest.getProgrammingLanguageName().isBlank()) {
			 throw new Exception("Name cannot be empty");
		 }
		 for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
            if (language.getProgrammingLanguageName().equalsIgnoreCase(createProgrammingLanguageRequest.getProgrammingLanguageName())) {
            	throw new Exception("Name cannot be repeated");
            }	 
		 }
//		 for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
//            if (language.getProgrammingLanguageId()==) {
//            	throw new Exception("Id cannot be repeated");
//            }	 
//		 }
		 ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		 programmingLanguage.setProgrammingLanguageName(createProgrammingLanguageRequest.getProgrammingLanguageName());
		 programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void update(String name, int id) throws Exception{
		for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
            if (language.getProgrammingLanguageName().equals(name)) {
            	throw new Exception("Name cannot be repeated");
            }	 
		}
		for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
            if (language.getProgrammingLanguageId()==id) {
	    		programmingLanguageRepository.save(null);
            }	
		}

	}

	@Override
	public void delete(int id) throws Exception{
		programmingLanguageRepository.deleteById(id); 
	}



}
