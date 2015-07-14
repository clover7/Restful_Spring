package com.restful.test; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restful.test.service.MeasureServices; 

/**
 * Handles requests for the application home page.
 */
@Controller
public class MeasureController {
	
	private static final Logger logger = LoggerFactory.getLogger(MeasureController.class);
	
	@Autowired
	MeasureServices ms;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String home(Model model) { 
		logger.info("|| Welcome!"); 
		model.addAttribute("lists", ms.getList());
		
		return "home";
	}
	
}
