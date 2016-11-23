package com.citi.pf.configlib;

import com.citi.pf.configlib.initial.impl.InitialProcessImpl;

public class PFConfigLibApplication {

	public static void main(String[] args) {
		
		InitialProcessImpl initialProcessImpl=new InitialProcessImpl();
		initialProcessImpl.InitLib(args);
	
	}
	
}
