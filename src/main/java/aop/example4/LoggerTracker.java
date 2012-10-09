package aop.example4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerTracker {
	
	@Before("execution(* do*(..))")
	public void track(){
		System.out.println(">>>> something is doing");
	}

	
	
}
