package com.tricounsel.communication.service.service;


import com.tricounsel.communication.pattern.request.SimpleMailRequest;

public interface EmailService {
	public void simple(SimpleMailRequest signinMail);
}
