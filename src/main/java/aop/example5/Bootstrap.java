package aop.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example5/spring-config.xml");
		Service service = context.getBean(Service.class);
	
		service.doMessage("Hello world");
	
	}

}
