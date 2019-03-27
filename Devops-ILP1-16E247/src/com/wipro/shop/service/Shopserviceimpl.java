package com.wipro.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.shop.dao.Shopdao;
import com.wipro.shop.model.Login;
import com.wipro.shop.model.Shoe;

@Service("shopservice")
public class Shopserviceimpl implements Shopservice{
	@Autowired
	private Shopdao shopdao;

	@Transactional
	@Override
	public String doRegister(Login login) {
		return shopdao.doRegister(login);
	}

	@Transactional
	@Override
	public String doRegister1(Shoe shoe) {
		return shopdao.doRegister1(shoe);
	}
	@Override
	public Login dologin(String uname, String password) {
		return shopdao.dologin(uname, password);
	}

}
