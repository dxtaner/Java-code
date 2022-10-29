package Devs.Devs.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Devs.Devs.business.abstracts.ProgrammingLanguageServices;
import Devs.Devs.entities.concretes.ProgrammingLanguage;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageServices programmingLanguagesServices;
	
	public ProgrammingLanguagesController(ProgrammingLanguageServices ProgrammingLanguagesServices) {
		super();
		this.programmingLanguagesServices = ProgrammingLanguagesServices;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguagesServices.getAll();
	}
	
	@GetMapping("/{id}")
    public ProgrammingLanguage getProgrammingLanguageById(@PathVariable int id) {
        return programmingLanguagesServices.getById(id);
    }
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguagesServices.add(programmingLanguage);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable String name, @PathVariable int id) throws Exception {
		programmingLanguagesServices.update(name,id);
    }
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) throws Exception {
		programmingLanguagesServices.delete(id);
	}
	

}
