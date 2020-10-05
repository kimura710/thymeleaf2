package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {
	
	@RequestMapping("/{id}")
	public ModelAndView index(@PathVariable int id,ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("id",id);
		mav.addObject("check",id >= 0);
		mav.addObject("trueVal","positive!");
		mav.addObject("falseVal","negative...");
		return mav;
	}

}
