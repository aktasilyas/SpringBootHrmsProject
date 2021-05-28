package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

	//integer vermemizin sebebi id nin integer olmasindan
}
