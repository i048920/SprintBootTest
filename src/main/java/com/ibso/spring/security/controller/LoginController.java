package com.ibso.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PreAuthorize("permitAll()")
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
		if (error != null) {
			System.out.println("login fail %%%%%%%%%%%%%%%%%%%%%%%%");
			return "login-failure";
			
		}
		System.out.println("login success %%%%%%%%%%%%%%%%%%%%%%%%");
		return "login";
	}
}
