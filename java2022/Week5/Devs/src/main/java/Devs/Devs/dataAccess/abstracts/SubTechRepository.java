package Devs.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Devs.Devs.entities.concretes.SubTech;

public interface SubTechRepository extends JpaRepository<SubTech, Integer> {

}
