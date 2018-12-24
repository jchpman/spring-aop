package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint){
		logger.info(" BEFORE>>>Check for user access ");
		logger.info(" BEFORE>>>Allowed execution for {}", joinPoint);
	}

}
