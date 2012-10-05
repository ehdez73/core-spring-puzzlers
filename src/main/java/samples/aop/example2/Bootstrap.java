package samples.aop.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("samples/aop/example2/spring-config.xml");
		Service service = context.getBean(Service.class);
		
		// How many times will be displayed the track message ?
		
		service.doMessage();
		service.doWork();
		service.doAll();
	}

}
