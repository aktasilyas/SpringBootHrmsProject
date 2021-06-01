package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	public Result add(JobPosition jobPosition);
	public Result delete(JobPosition jobPosition);
}
