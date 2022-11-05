package Devs.Devs.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Devs.Devs.business.abstracts.ProgrammingLanguageServices;
import Devs.Devs.business.requests.programmingLanguageRequests.CreateProgrammingLanguageRequest;
import Devs.Devs.business.requests.programmingLanguageRequests.UpdateProgrammingLanguageRequest;
import Devs.Devs.business.responses.programmingLanguageResponses.GetAllProgrrammingLanguagesResponse;
import Devs.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageServices programmingLanguagesServices;
	
	public ProgrammingLanguagesController(ProgrammingLanguageServices ProgrammingLanguagesServices) {
		super();
		this.programmingLanguagesServices = ProgrammingLanguagesServices;
	}

	@GetMapping("/getall")
	public List<GetAllProgrrammingLanguagesResponse> getAll(){
		return programmingLanguagesServices.getAll();
	}
	
	@GetMapping("/{id}")
    public ProgrammingLanguage getProgrammingLanguageById(int id) {
        return programmingLanguagesServices.getById(id);
    }
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		this.programmingLanguagesServices.add(createProgrammingLanguageRequest);
	}

	@PutMapping("/update/{id}")
	public void update(UpdateProgrammingLanguageRequest  updateProgrammingLanguageRequest) throws Exception {
		programmingLanguagesServices.update(updateProgrammingLanguageRequest);
    }
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) throws Exception {
		programmingLanguagesServices.delete(id);
	}
	

}
