package com.dd.dp.cp.abstractfactory.gcp;

import com.dd.dp.cp.abstractfactory.Instance;
import com.dd.dp.cp.abstractfactory.Storage;

public class GoogleCloudEngine implements Instance {
	
	public GoogleCloudEngine(Capacity capacity) {
		System.out.println("Google cloud engine has been created.");
	}

	@Override
	public void start() {
		System.out.println("Google cloud engine has been started.");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Storage has been attached with Google Cloud Engine");
	}

	@Override
	public void stop() {
		System.out.println("Google cloud engine has been stopped.");
	}
	
}
