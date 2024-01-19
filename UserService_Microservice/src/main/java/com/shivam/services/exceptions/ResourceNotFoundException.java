package com.shivam.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Resouce Not Found on Server !!!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	// Extra Properties That You Want To Manage...
}
