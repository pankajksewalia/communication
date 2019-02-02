package com.tricounsel.communication.core.enums;

public enum ErrorCodes {
	UNABLE_SEQ_ID("TC_COM_1000","Unable to get sequence id"),
	EXCEPTION("TC_COM_500","Please contact to administartor."),
	VALID_MOBILE_EMAIL("TC_COM_5000","Email address or mobile number is not valid");
	
	public String getValue() {
		return value;
	}

	public String getMessage() {
		return message;
	}

	private final String value;
    private final String message;
    
    ErrorCodes(String value, String message) {
        this.value = value;
        this.message = message;
    }
}
