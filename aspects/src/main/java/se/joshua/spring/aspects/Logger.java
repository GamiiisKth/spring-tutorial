package se.joshua.spring.aspects;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *
 *     // the ide behind aspects is that we want this method to run before Camera class snap method
 */

// this class called for aspect
public class Logger {

    // this method called for advise
    //method  aboutTakePhoto advice Camera.snap method
    public void aboutTakePhoto(){
        System.out.println("About to take a photo ......");
    }
}
