package com.citi.pf.configlib.service.impl;

import org.springframework.stereotype.Service;

import com.citi.pf.configlib.service.IConfigUpdate;

@Service("iConfigUpdate")
public class ConfigUpdateImpl implements IConfigUpdate{

	@Override
	public void pushConfigUpdate(String configUpdate, String URL) {
		// push configupdate to configservice
		
	}

	@Override
	public String pullConfigUpdate(String URL) {
		// push configcontent from configservice
		return null;
	}

}
