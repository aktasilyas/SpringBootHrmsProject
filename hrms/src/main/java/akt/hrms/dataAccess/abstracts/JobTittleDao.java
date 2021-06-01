package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.JobTittle;

public interface JobTittleDao  extends JpaRepository<JobTittle, Integer> {

}