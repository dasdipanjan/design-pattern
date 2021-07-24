package com.dd.dp.cp.singleton;

public class LazyDoubleLockSingleton {
	private static LazyDoubleLockSingleton instance;

	private LazyDoubleLockSingleton() {
		System.out.println("LazyDoubleLockSingleton object has been created.");
	}
	
	public static LazyDoubleLockSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleLockSingleton.class) {
				if (instance == null) {
					instance = new LazyDoubleLockSingleton();
				}
			}
		}
		return instance;
	}

}
