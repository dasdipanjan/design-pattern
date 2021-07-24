package com.dd.dp.cp.abstractfactory.aws;

import com.dd.dp.cp.abstractfactory.Instance;
import com.dd.dp.cp.abstractfactory.Storage;

public class Ec2Instance implements Instance{

	public Ec2Instance(Capacity capacity) {
		System.out.println("Ec2Instance has been created.");
	}

	@Override
	public void start() {
		System.out.println("Ec2 Instance has been started.");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Storage has been attached in Ec2Instance.");
	}

	@Override
	public void stop() {
		System.out.println("Ec2 instance has been stopped.");
	}
	
}
