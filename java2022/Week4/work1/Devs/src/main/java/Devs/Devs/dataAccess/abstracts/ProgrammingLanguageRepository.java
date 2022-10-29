package Devs.Devs.dataAccess.abstracts;

import java.util.List;

import Devs.Devs.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage);
	void update(String name,int id) throws Exception;
	void delete(int id);
	ProgrammingLanguage getById(int id);
}
