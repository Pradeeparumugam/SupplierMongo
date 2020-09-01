package com.dxctraining.suppliermgt.exception;

public class NotFoundException extends RuntimeException{
	public NotFoundException(String alert) {
		super(alert);
	}

}
