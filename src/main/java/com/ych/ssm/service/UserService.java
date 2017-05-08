package com.ych.ssm.service;

import java.util.List;

import com.ych.ssm.entity.User;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
