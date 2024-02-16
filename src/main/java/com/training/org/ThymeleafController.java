package com.training.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

	@RequestMapping("/hello")
	public String getMessage(Model model) {
		model.addAttribute("name", "Hello gm");
		return "Hello";
	}
	
	@RequestMapping("/")
	public String getIndex(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.GET)    
	public ModelAndView saveRecord(@ModelAttribute Employee employee)  
	{    
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("employee-data");        
		modelAndView.addObject("employee", employee);      
		return modelAndView;    
	}
}
