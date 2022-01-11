package com.NepalCode.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {

	@RequestMapping("/baseball")
	public String getBaseball() {
		return "Bropage";
	}
	
}
