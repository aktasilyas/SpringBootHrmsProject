package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.Department;

public interface DepartmentService {

	public DataResult<List<Department>> getAll();
	public Result add(Department department);
	public Result delete(Department department);
}