package com.tricounsel.communication.core.exception;

import com.tricounsel.communication.core.enums.ErrorCodes;

public class TCComException extends RuntimeException {

	private static final long serialVersionUID = 374983788L;
	
	private ErrorCodes code;

	public TCComException(String message) {        
        super(message);
    }
    
    public TCComException(ErrorCodes code) {        
    	super(code.getMessage());
        this.code = code;
    }
    
    public TCComException(ErrorCodes code, String message) {        
    	super(message);
        this.code = code;
    }
    
    public TCComException(ErrorCodes code, Throwable t) {        
    	super(t);
        this.code = code;
    }
    
    public TCComException(String message, Throwable t) {        
    	super(message, t);
    }

	public ErrorCodes getCode() {
		return code;
	}

	public void setCode(ErrorCodes code) {
		this.code = code;
	}
}
