package com.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.UserAccount;

@Repository
public interface UserAccountRepo extends CrudRepository<UserAccount, Integer> {
	
	@Query(value="select * from user_account where id=:id",nativeQuery = true)
	Optional<UserAccount> findById(Integer id);

}
