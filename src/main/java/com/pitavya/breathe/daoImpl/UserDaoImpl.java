package com.pitavya.breathe.daoImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pitavya.breathe.dao.UserDao;
import com.pitavya.breathe.model.UserEntity;
import com.pitavya.breathe.repo.UserRepo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepo.save(user);
	}

	@Override
	public UserEntity getUserByUserId(long userId) {
		Optional<UserEntity> user = userRepo.findById(userId);
		return user != null ? user.get() : null;
	}

	@Override
	public UserEntity getUserByEmail(String email) {
		return userRepo.findByEmailId(email);
	}

	@Override
	public UserEntity getUserByProvidedId(String providedId) {
		return userRepo.findByProvidedId(providedId);
	}

}
