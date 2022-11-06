package Devs.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Devs.Devs.business.abstracts.SubTechServices;
import Devs.Devs.business.requests.subTechRequests.CreateSubTechRequest;
import Devs.Devs.business.requests.subTechRequests.UpdateSubTechRequest;
import Devs.Devs.business.responses.subTechResponses.GetAllSubTechsResponse;
import Devs.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Devs.Devs.dataAccess.abstracts.SubTechRepository;
import Devs.Devs.entities.concretes.ProgrammingLanguage;
import Devs.Devs.entities.concretes.SubTech;

@Service
public class SubTechManager implements SubTechServices {

	private SubTechRepository subTechRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	public SubTechManager(SubTechRepository subTechRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.subTechRepository = subTechRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Autowired
	public SubTechManager(SubTechRepository subTechRepository) {
		super();
		this.subTechRepository = subTechRepository;
	}

	@Override
	public List<GetAllSubTechsResponse> getAll() {
		List<SubTech> subTechs = subTechRepository.findAll();
		List<GetAllSubTechsResponse> subTechsResponse = new ArrayList<GetAllSubTechsResponse>();
		
		for (SubTech subTech : subTechs) {
			
			GetAllSubTechsResponse responseItem = new GetAllSubTechsResponse();
			responseItem.setSubTechId(subTech.getSubTechId());
			responseItem.setSubTechName(subTech.getSubTechName());
	
			responseItem.setProgrammingLanguageId(subTech.getProgrammingLanguage().getProgrammingLanguageId());
			
			
			subTechsResponse.add(responseItem);
		}
		return subTechsResponse;	
	}

	@Override
	public void add(CreateSubTechRequest createSubTechRequest) throws Exception {
		 if(createSubTechRequest.getSubTechName().isEmpty() || createSubTechRequest.getSubTechName().isBlank()) {
			 throw new Exception("Name cannot be empty");
		 }
		 for (SubTech subTech : subTechRepository.findAll()) {
            if (subTech.getSubTechName().equalsIgnoreCase(createSubTechRequest.getSubTechName())) {
            	throw new Exception("Name cannot be repeated");
            }	 
		 }
		 ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(createSubTechRequest.getProgrammingLanguageId()).get();		 
		 if(programmingLanguage==null) {
         	throw new Exception("Programming langugage couldn't find by id"+createSubTechRequest.getProgrammingLanguageId());
		 }
		 else {
			 SubTech subTech = new SubTech();
			 subTech.setSubTechName(createSubTechRequest.getSubTechName());	
			 subTech.setProgrammingLanguage(programmingLanguage);	
			 subTechRepository.save(subTech);
		 }
	}

	@Override
	public void delete(int id) throws Exception {
		subTechRepository.deleteById(id); 
	}

	@Override
	public SubTech getById(int id) {
		for (SubTech subTech : subTechRepository.findAll()) {
			if(subTech.getSubTechId()==id) {
				return subTech;
			}
		}
		return null;
	}

	@Override
	public void update(UpdateSubTechRequest updateSubTechRequest) throws Exception {
		for (SubTech subTech : subTechRepository.findAll()) {
            if (subTech.getSubTechName().equals(updateSubTechRequest.getSubTechName())) {
            	throw new Exception("Name cannot be repeated");
            }	 
		}
		for (SubTech subTech : subTechRepository.findAll()) {
			 if (subTech.getSubTechId()==updateSubTechRequest.getSubTechId()) {				 
				 subTech.setSubTechName(updateSubTechRequest.getSubTechName());				 
				 subTechRepository.save(subTech); 
			 }	 
		}
	}		

}
