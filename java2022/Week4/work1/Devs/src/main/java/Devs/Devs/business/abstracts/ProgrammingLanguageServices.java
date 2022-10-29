package Devs.Devs.business.abstracts;

import java.util.List;

import Devs.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageServices {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(String name,int id) throws Exception;
	void delete(int id) throws Exception;
}
