package com.pitavya.breathe.service;

import com.pitavya.breathe.model.UserEntity;
import com.pitavya.breathe.requestModels.SaveUserRequestModel;
import com.pitavya.breathe.responseModels.SaveUserResponseModel;

public interface UserService {

	UserEntity saveUserService(SaveUserRequestModel requestModel);

	UserEntity getUserByUserId(long userId);

	UserEntity getUserByEmail(String email);

	UserEntity getUserByProvidedId(String providedId);

}
