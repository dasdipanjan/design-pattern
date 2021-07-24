package com.dd.dp.cp.abstractfactory.aws;

import com.dd.dp.cp.abstractfactory.Storage;

public class S3Instance implements Storage{

	public S3Instance(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
	
}
