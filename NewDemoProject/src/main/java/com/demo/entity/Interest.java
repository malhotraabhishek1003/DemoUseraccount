package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="interest")
@Data
public class Interest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String likes;
	private String dislikes;
	private String hobbies;
	private String profileUrl;
	private String about;
//	private int userAccountId;
	
	@OneToOne
	@JoinColumn(name = "user_id",referencedColumnName = "id")
//	@JsonIgnore
	private UserAccount userAccount;
}
