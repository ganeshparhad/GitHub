package com.amdocs.training.SpringAOP.service;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class ServiceLoggingAspect
{
private static final Logger logger = LoggerFactory.getLogger(ServiceLoggingAspect.class);

@Before("execution(* com.amdocs.training.SpringAOP.service.*.*(..))")
public void logBefore(JoinPoint joinPoint) {
System.out.println("Before: " + joinPoint);
}

@AfterReturning("execution(* com.amdocs.training.SpringAOP.service.*.*(..))")
public void logAfterReturning(JoinPoint joinPoint) {
System.out.println("After returning: " + joinPoint);
}

@Around("execution(* com.amdocs.training.SpringAOP.service.*.*(..))")
public String logAround(ProceedingJoinPoint joinPoint) throws Throwable {
System.out.println("Around before: " + joinPoint);
String message=(String)joinPoint.proceed();
System.out.println("Around after: " + joinPoint);
return message;
}

@AfterThrowing(pointcut="execution(* com.amdocs.training.SpringAOP.service.*.*(..))",
throwing="ex")
public void logError(JoinPoint joinPoint,Exception ex) throws Throwable {
System.out.println("Throwing Exception " + ex.getMessage());
}
}
