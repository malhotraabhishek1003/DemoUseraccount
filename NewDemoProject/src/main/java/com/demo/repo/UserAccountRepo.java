package com.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.UserAccount;

@Repository
public interface UserAccountRepo extends CrudRepository<UserAccount, Integer> {

}
