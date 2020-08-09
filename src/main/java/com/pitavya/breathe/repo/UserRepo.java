package com.pitavya.breathe.repo;

import org.springframework.data.repository.CrudRepository;

import com.pitavya.breathe.model.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Long> {

	public UserEntity findByEmailId(String emailId);

	public UserEntity findByProvidedId(String providedId);

}
