package com.citi.pf.configlib.notification.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.citi.pf.configlib.notification.INotificationFacade;
import com.citi.pf.configlib.service.IConfigUpdate;

public class NotificationFacadeImpl implements INotificationFacade{
	
	@Autowired
	private IConfigUpdate iConfigUpdate;

	@Override
	public void notificationListen() {
		// listen realtime notification from configservice
		//actually I think here should be a rest service for configservice to call
		
		//if(ConfigUpdateStatus==ture)
		iConfigUpdate.pullConfigUpdate("URL");
	}
	
	

}
