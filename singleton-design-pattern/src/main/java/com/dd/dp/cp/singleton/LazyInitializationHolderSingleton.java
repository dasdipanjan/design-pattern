package com.dd.dp.cp.singleton;

public class LazyInitializationHolderSingleton {

	private LazyInitializationHolderSingleton() {
		
	}
	
	private static class InitializationHolder {
		private static final LazyInitializationHolderSingleton INSTANCE = new LazyInitializationHolderSingleton();
	}
	
	public static LazyInitializationHolderSingleton getInstance() {
		return InitializationHolder.INSTANCE;
	}
	
}
