package di.example1;

import org.springframework.stereotype.Component;

@Component
public class ServiceAImpl implements ServiceA {
	
	public void doMessage() {
		System.out.println( "Hello world!" );	
	}
}
