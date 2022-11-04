package example.com.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.com.rentACar.business.abstracts.BrandServices;
import example.com.rentACar.business.requests.CreateBrandRequest;
import example.com.rentACar.business.responses.GetAllBrandsResponse;
import example.com.rentACar.dataAccess.abstracts.BrandRepository;
import example.com.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandServices{
	
	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandResponse.add(responseItem);
		}
		return brandResponse;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
	}

}
