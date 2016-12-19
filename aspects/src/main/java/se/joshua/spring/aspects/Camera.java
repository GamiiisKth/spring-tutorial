package se.joshua.spring.aspects;

import org.springframework.stereotype.Component;


/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

@Component
public class Camera {

    public void snap(){
        System.out.println("SNAP");
    }

    public void snap(int exposure){
        System.out.println("SNAP "+ exposure);
    }



}
