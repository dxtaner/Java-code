package Devs.Devs.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Devs.Devs.business.abstracts.SubTechServices;
import Devs.Devs.business.requests.subTechRequests.CreateSubTechRequest;
import Devs.Devs.business.requests.subTechRequests.UpdateSubTechRequest;
import Devs.Devs.business.responses.subTechResponses.GetAllSubTechsResponse;
import Devs.Devs.entities.concretes.SubTech;

@RestController
@RequestMapping("/api/subtechs")
public class SubTechsController {
	private SubTechServices subTechServices;

	public SubTechsController(SubTechServices subTechServices) {
		super();
		this.subTechServices = subTechServices;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubTechsResponse> getAll(){
		return subTechServices.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateSubTechRequest createSubTechRequest) throws Exception {
		this.subTechServices.add(createSubTechRequest);
	}
	
	@GetMapping("/{id}")
    public SubTech geSubTechById(int id) {
        return subTechServices.getById(id);
    }
	
	@PutMapping("/update/{id}")
	public void update(UpdateSubTechRequest  updateSubTechRequest) throws Exception {
		subTechServices.update(updateSubTechRequest);
    }
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) throws Exception {
		subTechServices.delete(id);
	}

}
