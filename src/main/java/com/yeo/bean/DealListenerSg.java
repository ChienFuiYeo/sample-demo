package com.yeo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by yeo on 9/19/2018.
 */
@Profile("sg")
@Component(Constant.COMPONENT_NAME_DEAL_LISTENER + "sg")
public class DealListenerSg implements IDealListener {

	@Override
	public void onDealNotification() {
		System.out.println("Singapore Deal");
	}
}
