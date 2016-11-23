package com.citi.pf.configlib.service;

public interface IConfigUpdate {

	public void pushConfigUpdate(String configUpdate, String URL);

	public String pullConfigUpdate(String URL);
}
