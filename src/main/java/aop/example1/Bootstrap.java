package aop.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class Bootstrap {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example1/spring-config.xml");
		Service service = new ServiceImpl();
		
		// How many times will be displayed the track message ?  
		
		service.doMessage();
		service.doWork();
		service.doAll();
	}

}
