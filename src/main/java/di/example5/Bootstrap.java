package di.example5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("di/example5/spring-config.xml");

		// BeanA is created using "new" and BeanB is injected via AspectJ
	
		BeanA beanA = new BeanA();
		beanA.getBeanB().logMessage();
		
	}

	
}
