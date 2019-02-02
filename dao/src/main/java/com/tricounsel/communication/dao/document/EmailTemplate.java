package com.tricounsel.communication.dao.document;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="email_template")
public class EmailTemplate implements Serializable{

	private static final long serialVersionUID = 527055573839843675L;
	
	@Id
	@Field(value="_id")
	private Long id;

	@Indexed(unique=true)
	@Field(value="name")
	private String name;	

	@Field(value="template")
	private String template;

	@Field(value="created")
	private Date created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmailTemplate [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", template=");
		builder.append(template);
		builder.append(", created=");
		builder.append(created);
		builder.append("]");
		return builder.toString();
	}
	
}
