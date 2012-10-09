package aop.example3;

/**
 * 
 * to create the proxy for this class, we need CGLIB2 in classpath
 *
 */
public class Service2  {
	
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
