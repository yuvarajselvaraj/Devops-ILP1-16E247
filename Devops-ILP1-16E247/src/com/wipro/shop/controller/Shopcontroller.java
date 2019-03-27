package com.wipro.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.shop.model.Login;
import com.wipro.shop.model.Shoe;
import com.wipro.shop.service.Shopservice;

import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class Shopcontroller {
	@Autowired
	private Shopservice shopservice;
@RequestMapping(value="/")
public String dostart()
{
	return "index";
}
@RequestMapping(value="register")
public String dostart1()
{
	
	return "register";
	
}

@RequestMapping(value="login")
public String dostart2()
{
	return "index";
}
@RequestMapping(value = "/uregister", method = RequestMethod.POST)
public String doRegister(Model model, @ModelAttribute("shopbean") Login shopbean) {
	if (shopbean != null && shopbean.getUname()!=null && shopbean.getPassword()!=null)
		 {
		model.addAttribute("msg", "Registered Successfully");
		return shopservice.doRegister(shopbean);
	} else {
		model.addAttribute("msg", "Error Occured");
		return "index";
	}
}
@RequestMapping(value = "/shoedetails", method = RequestMethod.POST)
public String doRegister1(Model model, @ModelAttribute("shoebean") Shoe shoebean) {
	if (shoebean != null )
		 {
		model.addAttribute("msg", "Registered Successfully");
		return shopservice.doRegister1(shoebean);
	} else {
		model.addAttribute("msg", "Error Occured");
		return "index";
	}
}
@RequestMapping(value="/ulogin",method=RequestMethod.POST)
public String dologin(Model model,@ModelAttribute("shopbean") Login shopbean)
{
	if (shopbean.getUname() !=null && shopbean.getPassword() != null) {
		
		if (shopservice.dologin(shopbean.getUname(), shopbean.getPassword()) != null) {
			model.addAttribute("uid", shopbean.getUname());
			return "home";
		} else {
			model.addAttribute("msg", "Invalid Details");
			return "index";
		}

	} else {
		model.addAttribute("msg", "Please enter Details");
		return "index";
	}
}
}
