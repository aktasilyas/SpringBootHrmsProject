package akt.hrms.business.abstracts;

import java.util.List;

import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
	Result checkUser(String mail);
	DataResult<User> getUserDetailByMail(String userMail);
}
