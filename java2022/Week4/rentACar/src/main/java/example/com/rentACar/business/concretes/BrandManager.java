package example.com.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.com.rentACar.business.abstracts.BrandServices;
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
	public List<Brand> getAll() {
		return brandRepository.getAll();
	}

}
