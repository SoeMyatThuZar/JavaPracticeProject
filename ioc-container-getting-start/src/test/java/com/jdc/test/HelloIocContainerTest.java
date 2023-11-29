package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.ioc.bean.HelloBean;

public class HelloIocContainerTest {
	@Test
	void demo() {
		
		try(var context=new AnnotationConfigApplicationContext()){
			
			context.scan("com.jdc.ioc.bean");
			context.refresh();
			var bean=context.getBean(HelloBean.class);
			bean.greet();
			
		}
		
	}

}
