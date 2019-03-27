package com.wipro.shop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.shop.model.Login;
import com.wipro.shop.model.Shoe;

@Repository("shopdao")
public class Shopdaoimpl implements Shopdao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public String doRegister(Login login) {
		sessionFactory.getCurrentSession().save(login);
		return "index";
	}
	@Override
	@Transactional
	public String doRegister1(Shoe shoe) {
		sessionFactory.getCurrentSession().save(shoe);
		return "index";
	}
	@Transactional
	@Override
	public Login dologin(String uname, String password) {
		
		Login login = (Login) sessionFactory.getCurrentSession().get(Login.class,uname );
		if(login!=null && login.getPassword().equals(password)){
			return login;
		}
		return null;
	}
}
