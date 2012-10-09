package di.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example4/spring-config.xml");
		
		BeanB beanB = context.getBean(BeanB.class);
		BeanA beanA = context.getBean(BeanA.class);
		
		System.out.println("class of a.b : " + beanA.getBeanB().getClass());
		System.out.println("class of b.a : " + beanB.getBeanA().getClass());
		
	}

	
}
