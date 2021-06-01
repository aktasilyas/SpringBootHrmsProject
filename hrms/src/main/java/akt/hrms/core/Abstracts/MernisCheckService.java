package akt.hrms.core.Abstracts;

import org.springframework.stereotype.Service;

import akt.hrms.entities.concretes.JobSeeker;

@Service
public interface MernisCheckService {

	public boolean checkIfRealPerson(JobSeeker jobSeeker);
}