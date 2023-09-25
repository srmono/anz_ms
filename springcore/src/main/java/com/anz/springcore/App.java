package com.anz.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("config.xml");
    	
    	Student wst1 = (Student) context.getBean("anzstudet1");
    	
    	System.out.println(wst1);

    }
}
