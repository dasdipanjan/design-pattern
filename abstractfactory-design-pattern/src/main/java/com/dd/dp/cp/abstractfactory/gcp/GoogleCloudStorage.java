package com.dd.dp.cp.abstractfactory.gcp;

import com.dd.dp.cp.abstractfactory.Storage;

public class GoogleCloudStorage implements Storage{
	
	public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" on Google cloud storage");
    }

    @Override
    public String getId() {
        return "Google Cloud Storage";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
	
}
