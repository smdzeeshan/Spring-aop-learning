package com.mac;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	 @Pointcut("execution(* Operation.m*(..))")  
	 public void a1(){
		 
	 }
	 
	 @Pointcut("execution(* Operation.m*(..))")  
	 public void a2(){
	 
	 }

	 @Before("a1()")
	 public void beforeAdvice(JoinPoint jp) {  
	        System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	 
	 @After("a2()")
	 public void afterAdvice(JoinPoint jp) {
		 System.out.println("after additional concern");
		 System.out.println("Method signature: " + jp.getSignature());
	 }
	 
	 @AfterReturning (
			  pointcut = "execution(* Operation.*(..))",  
             returning = "result"
		)
	 public void returningAdvice(JoinPoint jp, Object result) {
		 System.out.println("The return result from " + jp.getSignature() + " is :" + result);
	 }
	 
	 @Pointcut("execution(* Operation.*(..))")
	 public void a4(){
		 
	 }  
	 
	 @Around("a4()")
	 public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		 
		 System.out.println("Additional Concern Before calling actual method"); 
	     Object obj=pjp.proceed();  
	     System.out.println("Additional Concern After calling actual method");  
	     return obj;  
		 
	 }
	 
	 @AfterThrowing (
			 pointcut = "execution (* Operation.*(..))",
			 throwing = "error"
		)
	 public void throwAdvice(JoinPoint jp, Throwable error ) {
		 System.out.println("additional concern from throwing advice");  
	     System.out.println("Method Signature: "  + jp.getSignature());  
	     System.out.println("Exception is: "+error);  
	     System.out.println("end of after throwing advice...");  
	 }
	 
}
