package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIDAO someCdiDao;

	public SomeCDIDAO getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCDIDAO someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
}
