package com.mac;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
	 public void myadvice(JoinPoint jp) {  
	        System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	 
	 @After("a2()")
	 public void myadvice2(JoinPoint jp) {
		 System.out.println("after additional concern");
		 System.out.println("Method signature: " + jp.getSignature());
	 }
}
