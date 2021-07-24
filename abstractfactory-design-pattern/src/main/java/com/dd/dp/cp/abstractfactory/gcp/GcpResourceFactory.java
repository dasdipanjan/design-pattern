package com.dd.dp.cp.abstractfactory.gcp;

import com.dd.dp.cp.abstractfactory.Instance;
import com.dd.dp.cp.abstractfactory.Instance.Capacity;
import com.dd.dp.cp.abstractfactory.ResourceFactory;
import com.dd.dp.cp.abstractfactory.Storage;

public class GcpResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleCloudEngine(capacity);
	}

	@Override
	public Storage createStorage(int inMb) {
		return new GoogleCloudStorage(inMb);
	}
	
}
