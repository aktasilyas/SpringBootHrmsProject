package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.DepartmentService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.dataAccess.abstracts.DepartmentDao;
import akt.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>
		(this.departmentDao.findAll(), "Departman datası listelendi.");
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Departman sisteme başarıyla eklendi..");
	}

	@Override
	public Result delete(Department department) {
		this.departmentDao.delete(department);
		return new SuccessResult("Departman Başarıyla Silindi.");
	}

}