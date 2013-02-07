package aop.example6;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class UsageTracking {
	

	  @DeclareParents(value="aop.example6.Service+", defaultImpl=DefaultUsageTracked.class)
	  public static UsageTracked mixin;

	  @Before("execution(* do*(..)) && this(usageTracked)")
	  public void recordUsage(UsageTracked usageTracked) {
	    usageTracked.incrementUseCount();
	  }

	
	
}
