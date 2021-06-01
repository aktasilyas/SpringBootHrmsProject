package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}