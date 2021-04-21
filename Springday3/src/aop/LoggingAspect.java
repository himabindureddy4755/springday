package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("allGetters()")

	//@Before("execution(public String aop.Triangle.getName())")
	@Before("execution(public * aop.*.get*())")   
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
	
	
	//@Pointcut("execution(* aop..*.get*())")
	//public void allGetters() {}

}