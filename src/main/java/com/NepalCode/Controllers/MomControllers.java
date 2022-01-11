package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomControllers {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String getSugar() {
		return "Ok. I will give you sugar";
	}

}
