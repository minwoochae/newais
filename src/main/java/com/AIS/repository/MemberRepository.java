package com.AIS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AIS.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	//select * from member where email = ?
	Member findByEmail(String email);
	
	//select * from member where password = ?
    Member findByPassword(String password);
    
  //select * from member where password = ?
    Member findByName(String name);
	
    Member findByNameAndPhoneNumber(String name, String  phoneNumber);
	
}
