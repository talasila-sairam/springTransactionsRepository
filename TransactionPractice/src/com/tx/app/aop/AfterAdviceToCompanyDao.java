package com.tx.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceToCompanyDao {
	
	@After("execution(* com.tx.app.dao.*.saveCompany(..))")
	public void sendMessage(JoinPoint jointPoint) {
		System.out.println("inside sendMessage method");
		throw new RuntimeException("Testing Purpose");
	}
}
