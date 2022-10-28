package example.com.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import example.com.rentACar.dataAccess.abstracts.BrandRepository;
import example.com.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands= new ArrayList<Brand>();
		brands.add(new Brand(1,"Bmw"));
		brands.add(new Brand(1,"Audi"));
		brands.add(new Brand(1,"Mercedes"));
		brands.add(new Brand(1,"Fiat"));
		brands.add(new Brand(1,"Reanult"));

	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
