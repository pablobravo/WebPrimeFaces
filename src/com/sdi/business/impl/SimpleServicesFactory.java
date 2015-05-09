package com.sdi.business.impl;


import com.sdi.business.AlumnosService;
import com.sdi.business.LoginService;
import com.sdi.business.ServicesFactory;

public class SimpleServicesFactory implements ServicesFactory {

	@Override
	public AlumnosService createAlumnosService() {
		return new SimpleAlumnosService();
	}

	@Override
	public LoginService createLoginService() {
		return new SimpleLoginService();
	}

}
