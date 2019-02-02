package com.tricounsel.communication.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricounsel.communication.dao.document.EmailTemplate;

@Repository
public interface EmailTemplateRepository extends MongoRepository<EmailTemplate, Object> {
	
	public EmailTemplate findByName(String name);
	
	public EmailTemplate findById(Long id);
}
