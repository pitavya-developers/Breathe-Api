package com.pitavya.breathe.dao;

import com.pitavya.breathe.model.UserEntity;

public interface UserDao {

	UserEntity saveUser(UserEntity user);

	UserEntity getUserByUserId(long userId);

	UserEntity getUserByEmail(String email);

	UserEntity getUserByProvidedId(String providedId);

}
