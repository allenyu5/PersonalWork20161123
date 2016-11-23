package com.citi.pf.configlib.service.impl;

import org.springframework.stereotype.Service;

import com.citi.pf.configlib.service.IConfigContent;

@Service("iConfigContent")
public class ConfigContentImpl implements IConfigContent{

	@Override
	public void pushConfigContent(String configContent, String URL) {
		// push configcontent to configservice
	}

	@Override
	public String pullConfigContent(String URL) {
		// pull configcontent from configservice
		return null;
	}

}
