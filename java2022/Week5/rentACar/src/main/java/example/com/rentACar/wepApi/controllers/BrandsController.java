package example.com.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.com.rentACar.business.abstracts.BrandServices;
import example.com.rentACar.business.requests.CreateBrandRequest;
import example.com.rentACar.business.responses.GetAllBrandsResponse;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	
	private BrandServices brandServices;
	
	public BrandsController(BrandServices brandServices) {
		super();
		this.brandServices = brandServices;
	}
	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll(){
		return brandServices.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandServices.add(createBrandRequest);
	}
}
