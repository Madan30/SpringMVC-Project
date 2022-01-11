package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	
	@ResponseBody
	@RequestMapping("/tea")
	public String getTea() {
		return "I will make tea for you";
	}
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeup() {
		return "i m dong makeup";
	}

}
