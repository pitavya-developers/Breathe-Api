package com.pitavya.breathe.serviceImpl;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitavya.breathe.dao.UserDao;
import com.pitavya.breathe.model.UserEntity;
import com.pitavya.breathe.requestModels.SaveUserRequestModel;
import com.pitavya.breathe.service.UserService;
import com.pitavya.breathe.utils.BreatheErrorConstants;
import com.pitavya.breathe.utils.DateUtils;

@Service
public class UserServiceImpl implements UserService {

	private static Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Override
	public UserEntity saveUserService(SaveUserRequestModel requestModel) {

		LOGGER.info("UserServiceImpl -- saveUserService()");

		UserEntity user = getUserByEmail(requestModel.getEmailId());
		if (user != null)
			return user;

		user = new UserEntity();
		user.setUserName(requestModel.getUserName());
		user.setEmailId(requestModel.getEmailId());
		user.setProvidedId(requestModel.getProvidedId());
		user.setProfilePic(requestModel.getProfilePicUri());
		user.setTimestamp(DateUtils.getTimeStamp());

		UserEntity savedUser = userDao.saveUser(user);

		if (savedUser == null)
			throw new RuntimeException(BreatheErrorConstants.USER_NOT_SAVED);

		return savedUser;
	}

	@Override
	public UserEntity getUserByUserId(long userId) {
		return userDao.getUserByUserId(userId);
	}

	@Override
	public UserEntity getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	@Override
	public UserEntity getUserByProvidedId(String providedId) {
		return userDao.getUserByProvidedId(providedId);
	}

}
