package com.dd.dp.cp.factorymethod;

import com.dd.dp.cp.factorymethod.message.Message;
import com.dd.dp.cp.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
