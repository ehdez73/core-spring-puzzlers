package samples.di.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceBImpl implements ServiceB {
	
	@Autowired
	private static ServiceA serviceA = new ServiceA() { 
			public void doMessage() {
				System.out.println("Default Message");
			}
		};

	public void doSomething() {
		serviceA.doMessage();
	}

	
}
