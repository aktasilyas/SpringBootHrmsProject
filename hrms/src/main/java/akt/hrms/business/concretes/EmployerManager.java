package akt.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.EmployerService;
import akt.hrms.core.Abstracts.MailSendService;
import akt.hrms.core.utilities.ErrorResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.dataAccess.abstracts.EmployerDao;
import akt.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private MailSendService emailSendService;
	private List<String> emails = new ArrayList<String>();

	@Autowired
	public EmployerManager(EmployerDao employerDao, MailSendService emailSendService) {
		super();
		this.employerDao = employerDao;
		this.emailSendService=emailSendService;		
	}
	
	@Override
	public Result login(String email, String password) {
		Result result= new ErrorResult("Giriş Başarısız!");
		for (int i = 0; i < getAll().size(); i++) {
			if(getAll().get(i).getEmail()==email && getAll().get(i).getPassword()==password) {
				result = new SuccessResult("Giriş Başarılı!");
			}
		}
		return result;
	}

	@Override
	public Result register(Employer employer) {
		Result result=new ErrorResult("Kayıt Başarısız!");
		if(emailIsItUsed(employer.getEmail())) {
			emailSendService.mailSend(employer.getEmail());
			employer.setVerificationStatus(false); //default 
			this.employerDao.save(employer);
			result = new SuccessResult("Kayıt Başarılı!");
		}
		return result;
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.delete(employer);
		return new SuccessResult("Başarıyla Silindi");
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public List<String> getAllEmails() {
		for (int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}

	public boolean emailIsItUsed(String email) {
		boolean result = true;
		if(getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

}