package com.wipro.shop.service;

import com.wipro.shop.model.Login;
import com.wipro.shop.model.Shoe;

public interface Shopservice {
	String doRegister(Login login);
	Login dologin(String uname,String password);
	String doRegister1(Shoe shoe);
	}
