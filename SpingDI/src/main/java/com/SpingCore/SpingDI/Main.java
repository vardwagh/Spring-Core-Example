package com.SpingCore.SpingDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		DrawShape shape1 = context.getBean("drawShape", DrawShape.class);
		
		shape1.getShape().draw();

	}
}
