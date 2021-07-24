package com.dd.dp.cp.abstractfactory;

import com.dd.dp.cp.abstractfactory.Instance.Capacity;

public interface ResourceFactory {
	Instance createInstance(Capacity capacity);
	Storage createStorage(int inMb);
}
