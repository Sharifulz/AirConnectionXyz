package com.air.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.air.model.AdminModel;
import com.air.model.ProductModel;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView  welcome() {
		List<ProductModel> productList = new ArrayList<>();
		ProductModel p1 = new ProductModel("Name1", "Desc1", 20, new Date(System.currentTimeMillis()), "Babies1");
		ProductModel p2 = new ProductModel("Name2", "Desc2", 20, new Date(System.currentTimeMillis()), "Babies2");
		ProductModel p3 = new ProductModel("Name3", "Desc3", 20, new Date(System.currentTimeMillis()), "Babies3");
		ProductModel p4 = new ProductModel("Name4", "Desc4", 20, new Date(System.currentTimeMillis()), "Babies4");
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		//model.setProdDesc("Product desc 10");
		ModelAndView mv = new ModelAndView();
		mv.addObject("prod", productList);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView  login() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Login page called");
		mv.setViewName("login");
		return mv;
	}
	
	@PostMapping("/submit_login")
	public ModelAndView  userAuthenticate(@ModelAttribute("admin") AdminModel admin) {
		ModelAndView mv = new ModelAndView();
		System.out.println("submited userdata page called, username: "+ admin.getUsername());
		mv.setViewName("login");
		return mv;
	}
	
}
