package akt.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import akt.hrms.core.Abstracts.MernisCheckService;
import akt.hrms.entities.concretes.JobSeeker;

@Primary
@Component
public class FakeMernisCheckService implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}
}