package com.yeo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by yeo on 9/19/2018.
 */
@Profile("tw")
@Component(Constant.COMPONENT_NAME_CREDIT_CHECK_LISTENER + "tw")
public class CreditCheckListenerTw implements ICreditCheckListener {
	@Override
	public void onCreditCheck() {
		System.out.println("Taiwan Credit Check");
	}
}
