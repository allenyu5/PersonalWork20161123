package com.citi.pf.configlib.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.citi.pf.configlib.service.IConfigUpdate;

public class FileFacade {
	
	@Autowired
	private IConfigUpdate iConfigUpdate;
	
	public String loadConfigFile(String filePath){
		return null;
	}
	
	public void filewatch(String filePath){
		//watch file status
		//watchService.watch(filePath);
		while(true){
		//if file change
		iConfigUpdate.pushConfigUpdate("configUpdate", "URL");
		}
	}
	
}
