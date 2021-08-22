package com.newlecture.web.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.UsersDao;
import com.newlecture.web.entity.Users;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public int signUp(Users user) {
		usersDao.createUsers(user);
		return 0;

	}

	@Override
	public boolean loginCheck(String id, String password, HttpSession session) {
		
		Users user = usersDao.retrieveUsersByUserIdandPassword(id, password);
		
		if(user != null) {
			session.setAttribute("userId", user.getId());
			session.setAttribute("name", user.getName());
			session.setAttribute("userRole", user.getUserRole());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Override
	public boolean idCheck(String id) {
	
		Users user = usersDao.retrieveUserById(id);
		
		if(user != null) {
			return true;
		}
		
		return false;
	}


}
