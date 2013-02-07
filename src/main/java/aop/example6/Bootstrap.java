package aop.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example6/spring-config.xml");
		Service service = (Service) context.getBean("service");
	
		for (int i=0;i<5; i++){
			service.doMessage("Message " + i);
		}
		
		UsageTracked usageTracked = (UsageTracked) service;
		System.out.println("Service has been used " + usageTracked.getCount() + " times");
		
	}

}
