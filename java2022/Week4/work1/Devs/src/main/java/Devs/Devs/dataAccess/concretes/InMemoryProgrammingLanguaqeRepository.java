package Devs.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Devs.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Devs.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguaqeRepository implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguaqeRepository() {
		programmingLanguages= new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Scala"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(5,"JavaScript"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override 
	public void update(String name,int id) throws Exception {
		ProgrammingLanguage programmingLanguage = getById(id-1);
		programmingLanguage.setName(name);
	}

	@Override
	public void delete(int id) {
		programmingLanguages.remove((id-1));
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguages.get(id-1);
	}

}
