package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();
	
	Result add(JobPosition jobPosition);
}
