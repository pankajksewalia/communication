package com.tricounsel.communication.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.tricounsel.communication.core.utility.Utility;
import com.tricounsel.communication.dao.document.EmailTemplate;
import com.tricounsel.communication.dao.repository.EmailTemplateRepository;
import com.tricounsel.communication.pattern.request.SimpleMailRequest;
import com.tricounsel.communication.service.service.EmailService;

@Service("emailService")
public class EmailServiceImpl implements EmailService {
	
	 @Autowired
	 public JavaMailSender emailSender;
	 
	 @Autowired
	 private EmailTemplateRepository emailTemplateRepository;
	 
	@Override
	public void simple(SimpleMailRequest signinMail){
		
		EmailTemplate template=null;
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(signinMail.getTo()); 
        message.setSubject(signinMail.getSubject()); 
        
		if(signinMail.getTemplateId()!=null){
			
			template=emailTemplateRepository.findById(signinMail.getTemplateId());
			message.setText(Utility.putParamsInTemplate(template.getTemplate(), 
					signinMail.getParams()));
			
		}else if(StringUtils.isNotBlank(signinMail.getTemplateName())){
			
			template=emailTemplateRepository.findByName(signinMail.getTemplateName());
			message.setText(Utility.putParamsInTemplate(template.getTemplate(), 
					signinMail.getParams()));
			
		}else{
	        message.setText(signinMail.getText());			
		}
        emailSender.send(message);
	}

}
