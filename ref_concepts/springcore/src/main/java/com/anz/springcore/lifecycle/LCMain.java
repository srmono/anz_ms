package com.anz.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("com/anz/springcore/lifecycle/lcconfig.xml");
		
		context.registerShutdownHook();
		
		Pizza pz1 = (Pizza) context.getBean("pizza1");
		
		System.out.println(pz1);
		
		
	}
}
