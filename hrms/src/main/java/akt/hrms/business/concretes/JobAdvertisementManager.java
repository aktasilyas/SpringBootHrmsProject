package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.JobAdvertisementService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.dataAccess.abstracts.JobAdvertisementDao;
import akt.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
private JobAdvertisementDao jobAdvertisementDao;
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"İş İlanları Listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByActive() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActive());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Başarıyla Eklendi.");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Başarıyla Güncellendi.");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş İlanı Başarıyla Silindi.");
	}

}