package com.w;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	
   	
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

Engineer eng = context.getBean("theEngineer",Engineer.class);

       eng.work();
    }
}
