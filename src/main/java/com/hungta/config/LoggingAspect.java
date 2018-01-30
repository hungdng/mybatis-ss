package com.hungta.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // setup logger
    private static Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // setup pointcut declarations
    @Pointcut("execution(* com.hungta.controller.*.*(..))")
    private void forControllerPackage() {}

    // do the same for service and dao
    @Pointcut("execution(* com.hungta.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.hungta.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forDaoPackage() || forServicePackage()")
    private void forAppFlow() {}

    // add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint){
        String theMethod = theJoinPoint.getSignature().toShortString();

        // display method we are calling
        LOGGER.info("=========>> in @Before: calling method: " + theMethod);

        // display the arguments to the method

        // get the arguments
        Object[] args = theJoinPoint.getArgs();


        // loop thru and display args
        for (Object temArgs: args){
            LOGGER.info("=========>> argument " + temArgs);
        }
    }

    // add @AfterReturning advice
    @AfterReturning(pointcut = "forAppFlow()", returning = "theResult")
    public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
        // display method we are returning from
        String method = theJoinPoint.getSignature().toShortString();
        LOGGER.info("=========>> in @AfterReturning: from method: " + method);

        // display data returned
        LOGGER.info("=========>> Result:" + theResult);
    }
}
