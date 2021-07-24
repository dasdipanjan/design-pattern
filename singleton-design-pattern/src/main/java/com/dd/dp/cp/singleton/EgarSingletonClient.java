package com.dd.dp.cp.singleton;

public class EgarSingletonClient {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			EgarSingleton egarSingleton1 = EgarSingleton.getInstance();
			System.out.println(egarSingleton1.toString());
			System.out.println("Task1 completed execution");
		};
		
		Runnable task2 = () -> {
			EgarSingleton egarSingleton2 = EgarSingleton.getInstance();
			System.out.println(egarSingleton2.toString());
			System.out.println("Task2 completed execution");
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
	}

}
