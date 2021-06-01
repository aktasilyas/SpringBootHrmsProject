package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

}