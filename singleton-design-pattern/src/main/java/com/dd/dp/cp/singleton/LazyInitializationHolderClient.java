package com.dd.dp.cp.singleton;

public class LazyInitializationHolderClient {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			LazyInitializationHolderSingleton lazyInitializationHolderSingleton = LazyInitializationHolderSingleton.getInstance();
			System.out.println(lazyInitializationHolderSingleton.toString());
			System.out.println("Task1 completed execution");
		};
		
		Runnable task2 = () -> {
			LazyInitializationHolderSingleton lazyInitializationHolderSingleton = LazyInitializationHolderSingleton.getInstance();
			System.out.println(lazyInitializationHolderSingleton.toString());
			System.out.println("Task1 completed execution");
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
	}

}
