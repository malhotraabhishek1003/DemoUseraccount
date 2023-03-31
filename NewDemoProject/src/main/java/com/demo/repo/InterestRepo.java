package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Interest;

@Repository
public interface InterestRepo extends JpaRepository<Interest, Integer> {

}
