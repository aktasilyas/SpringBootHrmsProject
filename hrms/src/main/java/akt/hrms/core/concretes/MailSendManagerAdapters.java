package akt.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import akt.hrms.core.Abstracts.MailSendService;

public class MailSendManagerAdapters extends MailSendService{

private MailSendManagerAdapters mailSendManager;
	
	@Autowired
	public MailSendManagerAdapters(MailSendManagerAdapters mailSendManager) {
		this.mailSendManager = mailSendManager;
	}
	
	@Override
	public void mailSend(String email) {
		mailSendManager.mailSend(email);
	}
}