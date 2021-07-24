package com.dd.dp.cp.factorymethod.message;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

	public abstract String getContent();
	
	public void addDefaultHeaders() {
		System.out.println("Default header has been added.");
	}
	
	public void encrypt() {
		System.out.println("Message has been encrypted.");
	}
	
}
