package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.SystemPersonnelService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.dataAccess.abstracts.SystemPersonnelDao;
import akt.hrms.entities.concretes.SystemPersonnel;

@Service
public class SystemPersonnelManager implements SystemPersonnelService{

private SystemPersonnelDao systemPersonnelDao;
	
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}
	
	@Override
	public DataResult<List<SystemPersonnel>> getAll() {
		return new SuccessDataResult<List<SystemPersonnel>>
		(this.systemPersonnelDao.findAll(), "Çalışan bilgileri listelendi.");
	}

	@Override
	public Result delete(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.delete(systemPersonnel);
		return new SuccessResult("Sistem Personeli Başarılı Bir Şekilde Silindi.");
	}

	@Override
	public Result register(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.save(systemPersonnel);
		return new SuccessResult("Personel sisteme başarıyla eklendi.");
	}

}