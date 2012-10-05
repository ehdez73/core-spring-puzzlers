package samples.aop.example3;

public class ServiceImpl implements Service {
	
	public void doMessage() {
		System.out.println( "Hello world!" );	
	}
	
	public void doWork(){
		System.out.println("and now, working hard");
	}
	
	public void doAll(){
		System.out.println("doing all");
		doMessage();
		doWork();
	}

}
