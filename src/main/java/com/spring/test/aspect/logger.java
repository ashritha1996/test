package com.spring.test.aspect;

import com.spring.test.aspect.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class logger {

    //run before execution of that method in all classes
    // @Before("execution(public String getName())")
    // to run only for specific class
    //@Before("execution(public String com.spring.test.aspect.model.Circle.getName())")
    //to run one advise for all getters returning String or for any return type then put *
    //@Before("execution(public * get*())")
    //to run one advise for all getters with arguments
    //@Before("execution(* get*(*))")
    //to run one advise for all getters with/ without arguments
    //@Before("execution(* get*(..))")

    //    //one common declaration for multiple methods
//    @Before("allCircleMethods()")
//    public void loggingAdvise(){
//        System.out.println("Advise is run, get method is called");
//    }

    //one common declaration for multiple methods - customize logging based on the method
    @Before("allCircleMethods()")
    public void loggingAdvise(JoinPoint joinPoint) {
        //gives the method which got executed
        System.out.println(joinPoint.toString());
        //gives the object which called this and use that object
        System.out.println(joinPoint.getTarget().toString());
        Circle circle = (Circle) joinPoint.getTarget();
        System.out.println(circle.getName());
    }

    //for a method which calls with string as its argumrnt
    @Before("args(String)")
    public void stringArgAdvise() {
        System.out.println("A method with string as its argument is called");
    }

    //for a method which calls with name to use the value itself
    @Before("args(name)")
    public void valueArgAdvise(String name) {
        System.out.println("name passed: "  + name);
    }

    @Before("allGetters()")
    public void secondAdvise() {
        System.out.println("Second Advise is run, get method is called");
    }

    @Before("allPackMethods()")
    public void thirdAdvise() {
        System.out.println("Third Advise is run, get method is called");
    }

    //for all Getters and all circle methods - by using logical expressions
    @Before("allCircleMethods() && allPackMethods()")
    public void fourthAdvise() {
        System.out.println("fourthAdvise is run, get method is called");
    }

    //runs after irrespective of whether the method is done or not
    @After("args(name)")
    public void afterAdvise(String name) {
        System.out.println("afterAdvise is run");
    }

    //runs after the complete method is done
    @AfterReturning("args(name)")
    public void afterReturningAdvise(String name) {
        System.out.println("afterReturningAdvise is run : " +  name);
    }

    //runs after the complete method is done -  input method of type string, return object of the method of type string
    @AfterReturning(pointcut="args(name)", returning = "returnString")
    //change String to Object - it will catch any return type and then need to cast it to use
    public void afterReturningAdvisewithpointcut(String name, String returnString) {
        System.out.println("afterReturningAdvise is run input: " +  name);
        System.out.println("afterReturningAdvise is run output: " +  returnString);
    }

    //runs after the exception is thrown
    @AfterThrowing("args(name)")
    public void afterExceptionAdvise(String name) {
        System.out.println("afterExceptionAdvise is run");
    }

    //runs after the exception is thrown - for catching
    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void afterExceptionThrowingAdvise(String name, RuntimeException ex) {
        System.out.println("afterExceptionAdvise is run, input:" +  name);
        System.out.println("afterExceptionAdvise is run, exception:" +  ex);

    }

    //around method advise for all getters, if returning a value, return type is Object
    //Loggable method - custom annotations for non pattern methods
    @Around("allGetters() && @annotation(com.spring.test.aspect.Loggable)")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object returnValue = null;

        try {
            //this runs before target method execution
            System.out.println("pre advise");
            //this is the place where advise method executes
            System.out.println("aroundadvisemethod" + joinPoint.proceed());
            returnValue = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("exception advise");
        }
        //this runs after target method execution
        System.out.println("post advise");
        return returnValue;
    }

    //one common declaration for multiple methods
    @Pointcut("execution(* get*())")
    public void allGetters() {
    }

    //all methods in one class

    @Pointcut("execution(* com.spring.test.aspect.model.Circle.*(..))")
    public void allCircleMethods() {
    }

    //for all methods in all classes of a package
    @Pointcut("within(com.spring.test.aspect.model..*)")
    public void allPackMethods() {
    }


}
