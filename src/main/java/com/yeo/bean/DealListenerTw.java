package com.yeo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by yeo on 9/19/2018.
 */
@Profile("tw")
@Component(Constant.COMPONENT_NAME_DEAL_LISTENER + "tw")
public class DealListenerTw implements IDealListener {

	@Override
	public void onDealNotification() {
		System.out.println("Taiwan Deal");
	}
}
