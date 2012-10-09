package di.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		
		// If ServiceA is Prototype ... When the constructor will be invoked?
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example3/spring-config.xml");
		System.out.println(">>>> Application Context created");
		
		ServiceB serviceB = context.getBean(ServiceB.class);
		System.out.println("ServiceB retrieved from application context");
		
		System.out.println("doing something with serviceB");
		serviceB.doSomething();
		
		System.out.println("doing something with serviceB");
		serviceB.doSomething();
		
	}

}
