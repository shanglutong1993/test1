package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	
	
	/**
	 * 增加用户的积分
	 * */
	void addSource(Integer id,Integer score);
}
