package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.CityService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.dataAccess.abstracts.CityDao;
import akt.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}
}