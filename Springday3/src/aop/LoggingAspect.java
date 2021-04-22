package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {
	//one aspect can contain multiple advices

		//@Before("execution(* aop..*.*(..))")   --- for all methods of all classes present in this package and its subpackages

		//@Before("execution(public String aop.Triangle.getName())")
		//@Before("execution(* aop..*.*(..))")  --for aop and its subpackages

		//@Before("execution(* aop..*.*(..))")

		//@Before("execution(public String aop.*.getName())")  --- for all getName methods in all classes within the package aop.model
		//@Before("execution(public * aop.*.getName())")  --- irrespective of return type
		//@Before("execution(public * aop.*.get*())")   --- for all methods which start with get


		//@Before("execution(* aop..*.get*())")  == 	@Before("allGetters()")

		/*
		 * @Before("allCircleMethods()") public void loggingAdvice(JoinPoint joinPoint)
		 * { String methodName = joinPoint.toLongString();
		 * 
		 * if(methodName.contains("getDia")) { Circle circle = (Circle)
		 * joinPoint.getTarget(); System.out.println(circle.getName());
		 * System.out.println("writing log for getdia method b4 its executed");
		 * 
		 * } else if(methodName.contains("setName")) {
		 * System.out.println("writing log for setName method b4 its executed");
		 * 
		 * 
		 * } }
		 */

		/*@Pointcut("execution(* aop..*.get*())")
		public void allGetters() {}

		@Pointcut("within(aop.Circle)")
		public void allCircleMethods() {}
		
		//@Before("args(name)")
		@Before("methodsStringArgs(name)")
		public void stringArgsAdvice(String name) {
			System.out.println("advice for all methods which accept a string as an argument "+name);
		}

		@Pointcut("args(name)")
		public void methodsStringArgs(String name) {}


		/*
		 * @Before("execution(* aop..*.get*())") public void secondAdviceforAllGetters()
		 * { System.out.println("second log before method is executed"); }
		 * 
		 * //@Before("execution(* aop..*.get*())")
		 * 
		 * @Before("allGetters") public void thirdAdviceforAllGetters() {
		 * System.out.println("third log before method is executed"); }
		 */
	/*@AfterReturning("allCircleMethods())")
	public void adviceAfterCircleMethodsComplete()
	{
		System.out.println("a circle method is returns");
	}
	@AfterThrowing("args(name)")
	public void adviceAfterExceptionThrown(String name)
	{
		System.out.println("a circle method is thrown"+name);
	}
	//@After("allCircleMethods()")
	/*public void adviceAfterCircleMethodsComplete()
	{
		System.out.println("a circle method is complete");
	}*/
	/*@AfterReturning(pointcut = "args(name)", returning="returnString")
	public void StringArgsMethods(String name ,String returnString)
	{
		System.out.println("input string ="+name +"\n output string ="+returnString);
	}*/
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	/*public void ExceptionAdvice(String name ,RuntimeException ex)
	{
		System.out.println("exception being thrown is "+ex);
	}*/
	/*@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}*/

	//@Pointcut("within(aop.Circle)")
	//public void allCircleMethods() {}

	@Pointcut("args(name)")
	public void methodsStringArgs(String name) {}
	//@Around("allGetters()")
	 
	//@Around("@annotation(aop.Loggable)") 
	public void myAroundAdvice(ProceedingJoinPoint pjp) {
		
		try {
			System.out.println("before advice");
			pjp.proceed();
			System.out.println("after method returns advice");

		} catch (Throwable e) {
			System.out.println("after throwing");
			//e.printStackTrace();
		} System.out.println("finally advice");
		
	}
	

		

	
	

	
	


}