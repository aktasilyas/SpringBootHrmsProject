package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.JobTitleService;
import akt.hrms.dataAccess.abstracts.JobTittleDao;
import akt.hrms.entities.concretes.JobTittle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTittleDao jobTittleDao;

	@Autowired
	public JobTitleManager(JobTittleDao jobTittleDao) {
		this.jobTittleDao  = jobTittleDao;
	}

	@Override
	public List<JobTittle> getAll() {
		return jobTittleDao.findAll();
	}

}