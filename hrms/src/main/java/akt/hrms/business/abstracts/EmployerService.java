package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.Employer;

public interface EmployerService {

	public Result login(String email, String password);
	public Result register(Employer employer);
	public Result delete(Employer employer);

	public List<Employer> getAll();
	public List<String> getAllEmails();

}