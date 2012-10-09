package di.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example1/spring-config.xml");
		ServiceB serviceB = context.getBean(ServiceB.class);
		
		// Which message will be printed?  "Hello world!" or "Default Message" ? 
		
		serviceB.doSomething();
	}

}
