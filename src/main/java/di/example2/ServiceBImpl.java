package di.example2;

public class ServiceBImpl implements ServiceB {
	
	private ServiceA serviceA;
	
	public ServiceBImpl(ServiceA serviceA){
		this.serviceA = serviceA;
		System.out.println("calling constructor of ServiceBImpl");
	}

	public void doSomething() {
		serviceA.doMessage();
	}

	
}
