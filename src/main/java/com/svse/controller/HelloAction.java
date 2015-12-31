package com.svse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloAction implements Controller {

	public HelloAction(){
		System.out.println("HelloAction");
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","这是我的第一个springMVC程序");
		modelAndView.setViewName("/WEB-INF/jsp/success.jsp");
		
		return modelAndView;
	}

}
