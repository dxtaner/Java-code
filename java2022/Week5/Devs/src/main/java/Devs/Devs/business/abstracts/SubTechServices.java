package Devs.Devs.business.abstracts;

import java.util.List;

import Devs.Devs.business.requests.subTechRequests.CreateSubTechRequest;
import Devs.Devs.business.requests.subTechRequests.UpdateSubTechRequest;
import Devs.Devs.business.responses.subTechResponses.GetAllSubTechsResponse;
import Devs.Devs.entities.concretes.SubTech;

public interface SubTechServices {

	List<GetAllSubTechsResponse> getAll();
	void add(CreateSubTechRequest createSubTechRequest) throws Exception;
	void delete(int id) throws Exception;
	SubTech getById(int id);
	void update(UpdateSubTechRequest updateSubTechRequest) throws Exception;
}
