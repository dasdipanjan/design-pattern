package com.dd.dp.cp.factorymethod;

import com.dd.dp.cp.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message message = this.createMessage();
		message.addDefaultHeaders();
		message.encrypt();
		return message;
	}
	
	protected abstract Message createMessage();
}
