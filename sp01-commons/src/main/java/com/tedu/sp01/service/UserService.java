package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	
	
	/**
	 * �����û��Ļ���
	 * */
	void addSource(Integer id,Integer score);
}
