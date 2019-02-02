package com.tricounsel.communication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricounsel.communication.pattern.request.SimpleMailRequest;
import com.tricounsel.communication.service.service.EmailService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value = "/simple", method = RequestMethod.POST)
	public void signin(@RequestBody SimpleMailRequest signinMail){
		emailService.simple(signinMail);
	}
}
