package Devs.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Devs.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer>{

}
