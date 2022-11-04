package example.com.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import example.com.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
	
}