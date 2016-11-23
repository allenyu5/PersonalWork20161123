package com.citi.pf.configlib.initial.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.citi.pf.configlib.initial.IInitialProcess;
import com.citi.pf.configlib.service.IConfigContent;
import com.citi.pf.configlib.util.FileFacade;

public class InitialProcessImpl implements IInitialProcess{

	@Autowired
	private IConfigContent iConfigContent;
	
	private FileFacade fileFacade=null;
	
	@Override
	public void InitLib(String args[]) {
		fileFacade=new FileFacade();
		
		pullInitialConfig(args[0]);
		String configContent=fileFacade.loadConfigFile(args[1]);
		fileFacade.filewatch(args[1]);
		iConfigContent.pushConfigContent(configContent, args[2]);
		
	}
	
	public String pullInitialConfig(String URL){
		//pull initial config from configservice
		return null;
	}

}
