package akt.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import akt.hrms.core.Abstracts.MailCheckService;

@Primary
@Component
public class FakeMailCheckManager implements MailCheckService {

	@Override
	public boolean mailCheck(String email) {
	
		return true;
	}

	
}