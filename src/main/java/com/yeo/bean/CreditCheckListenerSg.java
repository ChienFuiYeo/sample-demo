package com.yeo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by yeo on 9/19/2018.
 */
@Profile("sg")
@Component(Constant.COMPONENT_NAME_CREDIT_CHECK_LISTENER + "sg")
public class CreditCheckListenerSg implements ICreditCheckListener {
	@Override
	public String onCreditCheck() {
		return "Singapore Credit Check";
	}
}
