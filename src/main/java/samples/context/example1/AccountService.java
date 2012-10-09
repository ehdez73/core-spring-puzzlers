package samples.context.example1;

public class AccountService {
	
	private String value;
	
	public void doSomething(){
		System.out.println("AccountService doing something with " + value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
