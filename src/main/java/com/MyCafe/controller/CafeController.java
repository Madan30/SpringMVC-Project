package com.MyCafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {

	@RequestMapping("/cafe")
	public String myCafe(Model model) {

		// sending data to view(jsp page)
		/*
		 * String myName="Madan Babu Ghale";
		 * 
		 * model.addAttribute("myNameValue", myName);
		 */
		model.addAttribute("myCafe", "Welcome to my cafe123");

		return "welcome-page";
	}

	@RequestMapping("/orderprocess")
	public String orderProcess(HttpServletRequest request, Model model) {

		// handle the data received from the user
		String userEnteredValue = request.getParameter("foodtype");

		// adding the captured value to the model
		model.addAttribute("userInput", userEnteredValue);

		// set the user data with the model object and send the data
		return "process-order";
	}

}
