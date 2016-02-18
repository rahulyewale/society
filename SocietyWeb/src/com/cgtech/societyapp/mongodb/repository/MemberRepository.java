package com.cgtech.societyapp.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cgtech.societyapp.dto.Member;

public interface MemberRepository extends MongoRepository<Member, String>{
	@Query("{ 'name' : ?0 }")
    Member getMemberByName(String name);
    
    @Query(value="{ 'age' : ?0}", fields="{ 'name' : 1, 'id' : 1}")
    List getMemberByAge(int age);
}
