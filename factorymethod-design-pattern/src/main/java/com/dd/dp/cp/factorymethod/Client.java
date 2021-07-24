package com.dd.dp.cp.factorymethod;

import com.dd.dp.cp.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
