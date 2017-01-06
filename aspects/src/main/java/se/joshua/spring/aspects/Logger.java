package se.joshua.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *         <p>
 *         // the ide behind aspects is that we want this method to run before Camera class snap method
 *         <p>
 *         <p>
 *         we can even use annotation to working with aspects
 */

// this class called for aspect
@Aspect
@Component
public class Logger {


    @Pointcut("execution(* se.joshua.spring.aspects.Camera.* (..))")
    public void cameraSnap() {
    }

    @Before("cameraSnap")
    public void afterAdvice(){
        System.out.println("it's done");
    }

    // this method called for advise
    //method  aboutTakePhoto advice Camera.snap method
    // this method will run before camera
    public void aboutTakePhoto() {
        System.out.println("About to take a photo ......");
    }
}
