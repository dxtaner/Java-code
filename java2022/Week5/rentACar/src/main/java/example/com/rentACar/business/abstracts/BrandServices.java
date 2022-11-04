package example.com.rentACar.business.abstracts;

import java.util.List;

import example.com.rentACar.business.requests.CreateBrandRequest;
import example.com.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandServices {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	
}
