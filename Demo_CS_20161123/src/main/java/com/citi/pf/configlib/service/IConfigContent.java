package com.citi.pf.configlib.service;

public interface IConfigContent {

	public void pushConfigContent(String configContent,String URL);
	
	public String pullConfigContent(String URL);
}
