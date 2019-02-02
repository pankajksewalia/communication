package com.tricounsel.communication.core.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tricounsel.communication.core.entity.Error;
import com.tricounsel.communication.core.enums.ErrorCodes;

@ControllerAdvice
public class APIExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(APIExceptionHandler.class);
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> handleException(Exception ex){
		LOGGER.error("Exception occured : ", ex);
		return new ResponseEntity<>(
				new Error(
						ErrorCodes.EXCEPTION.getValue(), 
						ErrorCodes.EXCEPTION.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()
				), 
		HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
