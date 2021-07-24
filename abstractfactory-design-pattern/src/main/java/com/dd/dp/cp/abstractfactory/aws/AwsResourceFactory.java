package com.dd.dp.cp.abstractfactory.aws;

import com.dd.dp.cp.abstractfactory.Instance;
import com.dd.dp.cp.abstractfactory.Instance.Capacity;
import com.dd.dp.cp.abstractfactory.ResourceFactory;
import com.dd.dp.cp.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int inMb) {
		return new S3Instance(inMb);
	}

}
