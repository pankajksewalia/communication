package com.tricounsel.communication.pattern.request;

import java.util.Map;

public class SimpleMailRequest {
	
	private Long templateId;
	private String templateName;
	private String to;
	private String from;
	private String subject;
	private String text;	
	private Map<String,String> params;
	
	public Long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SigninMail [templateId=");
		builder.append(templateId);
		builder.append(", templateName=");
		builder.append(templateName);
		builder.append(", to=");
		builder.append(to);
		builder.append(", from=");
		builder.append(from);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", text=");
		builder.append(text);
		builder.append(", params=");
		builder.append(params);
		builder.append("]");
		return builder.toString();
	}
}
