package com.wipro.shop.dao;

import com.wipro.shop.model.Login;
import com.wipro.shop.model.Shoe;

public interface Shopdao {
	String doRegister(Login login);
	Login dologin(String uname,String password);
	String doRegister1(Shoe shoe);
}
