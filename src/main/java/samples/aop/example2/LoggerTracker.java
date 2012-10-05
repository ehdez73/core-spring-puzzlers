package samples.aop.example2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerTracker {
	
	@Before("execution(* do*(..))")
	public void track(){
		System.out.println(">>>> something is doing");
	}

	
	
}
