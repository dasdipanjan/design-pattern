package com.dd.dp.cp.singleton;

public class LazyDoubleLockingSingletonClient {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			LazyDoubleLockSingleton lazyDoubleLockSingleton = LazyDoubleLockSingleton.getInstance();
			System.out.println(lazyDoubleLockSingleton.toString());
			System.out.println("Task1 completed execution");
		};
		
		Runnable task2 = () -> {
			LazyDoubleLockSingleton lazyDoubleLockSingleton = LazyDoubleLockSingleton.getInstance();
			System.out.println(lazyDoubleLockSingleton.toString());
			System.out.println("Task2 completed execution");
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
	}

}
