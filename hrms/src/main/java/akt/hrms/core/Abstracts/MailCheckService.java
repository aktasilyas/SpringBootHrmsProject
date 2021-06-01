package akt.hrms.core.Abstracts;

import org.springframework.stereotype.Service;

@Service
public interface MailCheckService {
	

	public boolean mailCheck(String email);
}
