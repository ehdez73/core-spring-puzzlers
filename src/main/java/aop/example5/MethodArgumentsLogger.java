package aop.example5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(value=1)
public class MethodArgumentsLogger {
	
	@Before("execution(* do*(..))")
	public void track(JoinPoint jp){
		System.out.println("Num. Arguments: " + jp.getArgs().length);
	}
	
}
