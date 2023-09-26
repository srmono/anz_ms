package com.anz.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AWMain {
	public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("com/anz/springcore/autowire/autowireconfig.xml");
    	
    	Emp emp1 =  context.getBean("emp1", Emp.class);
    	System.out.println(emp1);

    }
}
