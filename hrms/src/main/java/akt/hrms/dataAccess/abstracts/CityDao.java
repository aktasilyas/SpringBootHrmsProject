package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}