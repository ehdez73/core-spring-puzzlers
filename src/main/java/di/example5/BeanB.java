package di.example5;

public class BeanB {
	
	private String message;

	public BeanB(String message) {
		super();
		this.message = message;
	}

	public void logMessage(){
		System.out.println(message);
	}
	
}
