package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String args[]) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle = context.getBean("circle", Circle.class);
		
		circle.draw();
	}
}
