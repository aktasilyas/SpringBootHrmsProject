package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.SystemPersonnel;


public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer>{

}