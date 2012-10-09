package aop.example4;

public class ServiceImpl implements Service {
	
	public void doAll(){
		System.out.println("doing all");
		doWork();
	}

	public void doWork(){
		System.out.println("and now, working hard");
		doMessage();
	}

	public void doMessage() {
		System.out.println( "Hello world!" );	
	}
}
