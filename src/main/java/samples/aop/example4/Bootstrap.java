package samples.aop.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("samples/aop/example4/spring-config.xml");
		ServiceImpl service = context.getBean(ServiceImpl.class);
	
		service.doAll();
	
	}

}
