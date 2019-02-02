package com.tricounsel.communication.dao.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Sequence implements Serializable {

	private static final long serialVersionUID = -5381963541485818780L;

	@Id
	@Field(value = "_id")
	private String id;

	@Field(value = "seq")
	private long seq;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "SequenceId [id=" + id + ", seq=" + seq + "]";
	}
}
