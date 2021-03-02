package com.xlj.lagou;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author by anel
 * @date 2021/3/1 6:02 下午
 */
public class LagouBean implements InitializingBean {

	public LagouBean() {
		System.out.println("LaGouBean 构造器");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
