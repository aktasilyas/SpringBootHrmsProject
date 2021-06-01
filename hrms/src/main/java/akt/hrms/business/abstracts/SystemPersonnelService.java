package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {

	public DataResult<List<SystemPersonnel>> getAll();
	public Result delete(SystemPersonnel systemPersonnel);	
	public Result register(SystemPersonnel systemPersonnel);
}