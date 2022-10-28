package example.com.rentACar.dataAccess.abstracts;

import java.util.List;

import example.com.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();
}