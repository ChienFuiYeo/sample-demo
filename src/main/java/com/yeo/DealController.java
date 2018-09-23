package com.yeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeo.bean.Constant;
import com.yeo.bean.ICreditCheckListener;
import com.yeo.bean.IDealListener;

/**
 * Created by yeo on 7/19/2018.
 */
@RestController
@RequestMapping("/dn")
public class DealController {

	@Value("${region}")
	private String region;

	private IDealListener dealListener;

	private ICreditCheckListener creditCheckListener;

	@Autowired
	public void setDealListener(ApplicationContext context) {
		this.dealListener = (IDealListener) context
				.getBean(Constant.COMPONENT_NAME_DEAL_LISTENER + region.toLowerCase());
	}

	@Autowired
	public void setCreditCheckListener(ApplicationContext context) {
		this.creditCheckListener = (ICreditCheckListener) context
				.getBean(Constant.COMPONENT_NAME_CREDIT_CHECK_LISTENER + region.toLowerCase());
	}

	@GetMapping("/test")
	public String test() {
		// init()
		dealListener.onDealNotification();
		creditCheckListener.onCreditCheck();
		return "Ok";
	}
}
