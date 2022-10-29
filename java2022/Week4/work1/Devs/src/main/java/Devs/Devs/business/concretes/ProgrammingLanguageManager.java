package Devs.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Devs.Devs.business.abstracts.ProgrammingLanguageServices;
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
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getId()==id) {
				return programmingLanguageRepository.getById(id);
			}
		}
		return null;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		 if(programmingLanguage.getName().isEmpty()) {
			 throw new Exception("Name cannot be empty");
		 }
		 for (ProgrammingLanguage language : programmingLanguageRepository.getAll()) {
            if (language.getName().equals(programmingLanguage.getName())) {
            	throw new Exception("Name cannot be repeated");
            }	 
		 }
		 programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void update(String name, int id) throws Exception{
		 programmingLanguageRepository.update(name, id);
	}

	@Override
	public void delete(int id) throws Exception{
		programmingLanguageRepository.delete(id);
	}

}
