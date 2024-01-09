package org.crnts.collagedatamvc.controller;

import javax.validation.Valid;

import org.crnts.collagedatamvc.bean.Department;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentController {
	private static Logger log=LoggerFactory.getLogger(DepartmentController.class.getSimpleName());
	


	@RequestMapping( path = "/department", method = RequestMethod.GET)
	public ModelAndView department(ModelMap map)
	{
		map.addAttribute("headerName", "details");
		return new ModelAndView("department","dept",new Department() );
	}
	@RequestMapping(path = "/department" ,method = RequestMethod.POST)
	public ModelAndView createdept(@Valid @ModelAttribute (name="dept") Department department,BindingResult bindingResult,ModelMap map) 
	{
		map.addAttribute("headerName", "View Records");
		log.info(department.toString());
		
		return new ModelAndView("department","dept",department) ;
		
	}



}
