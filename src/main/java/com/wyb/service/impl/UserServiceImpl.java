package com.wyb.service.impl;

import org.springframework.stereotype.Service;

import com.wyb.service.UserServiceI;
@Service("userService")
public class UserServiceImpl implements UserServiceI{

	@Override
	public void test() {
		System.out.println("this is UserserviceImpl!!!");
	}

}
