package di.example2;



public class ServiceAImpl implements ServiceA {
	
	public ServiceAImpl(){
		System.out.println("calling constructor of ServiceAImpl");
	}

	public void doMessage() {
		System.out.println( "Hello world!" );	
	}
}
