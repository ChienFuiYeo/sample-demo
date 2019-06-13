package com.yeo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by yeo on 9/19/2018.
 */
@Profile("tw")
@Component(Constant.COMPONENT_NAME_DEAL_LISTENER + "tw")
public class DealListenerTw implements IDealListener {

	@Override
	public void onDealNotification() {

		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.printf("[%s] [%s] Taiwan Deal\n", inetAddress.getHostName(), inetAddress.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	}
}
