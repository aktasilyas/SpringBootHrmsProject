package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.entities.concretes.JobTittle;

public interface JobTitleService {

	List<JobTittle> getAll();
}