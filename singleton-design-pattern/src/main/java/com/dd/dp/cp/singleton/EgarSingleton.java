package com.dd.dp.cp.singleton;

public class EgarSingleton {
	private static final EgarSingleton instance = new  EgarSingleton();

	private EgarSingleton() {
		System.out.println("EgarSingleton object is created.");
	}
	
	public static final EgarSingleton getInstance() {
		return instance;
	}
}
