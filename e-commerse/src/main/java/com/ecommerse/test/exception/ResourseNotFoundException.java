package com.ecommerse.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// fields
	private String resourseName;
	private String fieldName;
	private String fieldValue;
	
	// constructor
	public ResourseNotFoundException(String resourseName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourseName,fieldName,fieldValue));
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	
	public String getResourseName() {
		return resourseName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}
