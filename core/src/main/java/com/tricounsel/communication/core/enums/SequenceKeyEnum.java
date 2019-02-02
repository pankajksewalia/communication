package com.tricounsel.communication.core.enums;

public enum SequenceKeyEnum {

	TEMPLATE("template");
	
	private String sequenceKey;

	public String getSequenceKey() {
		return sequenceKey;
	}

	private SequenceKeyEnum(String sequenceKey) {
        this.sequenceKey = sequenceKey;
    }
}
