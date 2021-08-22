package com.newlecture.web.dao;

import org.apache.ibatis.annotations.Param;

import com.newlecture.web.entity.Users;

public interface UsersDao {

	public void createUsers(Users users);
	// interface 목적에 부합하지 않은 annotaion이나 mybatis에서 객체가 아닌 전달을 바로 지원하지 못하므로 사용
	public Users retrieveUsersByUserIdandPassword(@Param("userId") String userId, @Param("password") String password);
	public Users retrieveUserById(String id);
}
