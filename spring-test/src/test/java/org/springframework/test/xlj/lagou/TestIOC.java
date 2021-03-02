package org.springframework.test.xlj.lagou;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by anel
 * @date 2021/3/1 6:33 下午
 */
public class TestIOC {

	@Test
	public void testIoC(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/xlj/applicationContext.xml");
		LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		System.out.println(lagouBean);
	}
}
