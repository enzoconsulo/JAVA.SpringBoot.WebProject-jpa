package com.enzoccs.SpringBootWebProject.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Error! Resource was not found! ID:"+id);
	}

}
