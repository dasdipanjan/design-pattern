package com.dd.dp.cp.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.getInstance("product");
		System.out.println(post.toString());
	}

}
