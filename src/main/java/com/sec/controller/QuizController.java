package com.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sec.model.User;

@RestController
public class QuizController {

	@GetMapping("/exam")
	public ModelAndView setExamLink()
	{
		ModelAndView model=null;
		
		
			model=new ModelAndView( "redirect:/afterlogin.html");
			model.addObject("link", "https://docs.google.com/forms/d/1M2ABFVgz4e5TH2Z71sFrV4kIr-cpyREaUQBfOwP4Pq0/edit");
			System.out.println("exammmmm");

			return model;
	}
}
