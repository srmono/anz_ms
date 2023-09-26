package com.anz.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
	public static void main(String[] args) {
		ApplicationContext context =
   			 new ClassPathXmlApplicationContext("com/anz/springcore/reftype/configref.xml");
		anzA wa = (anzA) context.getBean("waref");
		
		System.out.println(wa.getOb().getCount());
	}
}

