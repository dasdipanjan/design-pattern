package com.dd.dp.cp.abstractfactory;

import com.dd.dp.cp.abstractfactory.Instance.Capacity;
import com.dd.dp.cp.abstractfactory.aws.AwsResourceFactory;
import com.dd.dp.cp.abstractfactory.gcp.GcpResourceFactory;

public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String args[]) {
		Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Client gcp = new Client(new GcpResourceFactory());
    	i1 = gcp.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
	}
}
