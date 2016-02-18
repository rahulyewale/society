package com.cgtech.societyapp.dto;

import org.springframework.data.annotation.Id;

public class Member {

	@Id
	public Integer id;
	public String name;
	public Integer age;

	public Member(Integer id, String name, Integer age){
		this.id = id;
		this.name=name;
		this.age=age;
	}
}
