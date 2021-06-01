package akt.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import akt.hrms.business.abstracts.UserService;
import akt.hrms.business.validations.UserValidation;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.ErrorResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.core.utilities.SuccessDataResult;
import akt.hrms.core.utilities.SuccessResult;
import akt.hrms.core.utilities.contants.Messages;
import akt.hrms.dataAccess.abstracts.UserDao;
import akt.hrms.entities.concretes.User;


@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(userDao.findAll(),Messages.usersListed);
	}

	@Override
	public Result add(User user) {
	
		if(UserValidation.isValid(user)) {
			if (UserValidation.isValid(user)) {
				var result = this.checkUser(user.getEmail());
				if (!result.isSuccess()) {
					return new ErrorResult(result.getMessage());
				}
				this.userDao.save(user);
				return new SuccessResult(Messages.userAdded);
			}
			return new ErrorResult(Messages.ValidationIsIncorrect);
		}
		
		return new ErrorResult(Messages.ValidationIsIncorrect);
		
		 // this.userDao.save(user);
	     //   return new SuccessResult("Üye eklendi.");
	}

	@Override
	public Result checkUser(String mail) {
		var result = this.userDao.getByUserDetail(mail);
		if (result.getEmail() != null) {
			return new ErrorResult(Messages.userValid);
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<User> getUserDetailByMail(String userMail) {
		
		return new SuccessDataResult<User>(this.userDao.getByUserDetail(userMail));
	}

}
