package example.com.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.com.rentACar.business.abstracts.BrandServices;
import example.com.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	
	private BrandServices brandServices;
	
	public BrandsController(BrandServices brandServices) {
		super();
		this.brandServices = brandServices;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandServices.getAll();
	}

}
