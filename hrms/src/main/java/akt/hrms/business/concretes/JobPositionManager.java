package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.JobPositionService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.dataAccess.abstracts.JobPositionDao;
import akt.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
		this.jobPositionDao=jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Ürün eklendi");
	}

}
