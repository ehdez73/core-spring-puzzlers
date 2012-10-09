package aop.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example3/spring-config.xml");
		Service   service = context.getBean(Service.class);
		Service2 service2 = context.getBean(Service2.class);
		
		System.out.println(service.getClass());  // Its a $Proxy
		System.out.println(service2.getClass()); // Its Enhanced by CGLIB
		
		service.doMessage();
		service2.doMessage();
	}

}
