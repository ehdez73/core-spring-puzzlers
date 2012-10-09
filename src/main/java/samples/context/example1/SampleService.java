package samples.context.example1;

public class SampleService {
	
	private String value;
	
	public void doSomething(){
		System.out.println("SampleService doing something with " + value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
