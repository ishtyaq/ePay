package com.ishtiaq.epay;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaymentController {

	@RequestMapping(value="/verify", method=RequestMethod.POST)
	public String verify(HttpServletRequest request, Model model, String token) {
		model.addAttribute("token",token);
		return "verifyPayment";
	}
	
	@RequestMapping(value="/verify2")
	public String verify2(HttpServletRequest request, Model model, String token) {
		model.addAttribute("token","testing token data");
		return "verifyPayment";
	}
}
