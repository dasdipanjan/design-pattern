package com.dd.dp.cp.factorymethod;

import com.dd.dp.cp.factorymethod.message.JSONMessage;
import com.dd.dp.cp.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
