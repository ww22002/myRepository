package com.svse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("��������");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "��������");
		modelAndView.setViewName("success");
		return modelAndView;
	}

}
