package se.joshua.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *
 *
 * how the servelet works
 * http://4.bp.blogspot.com/-RaUWkZ1rurs/U4Q5eFLbxtI/AAAAAAAAFGg/nE-txgGcNcM/s1600/FC.jpg
 *
 * to get servelt load this bean and we want the spring to scan this package and find the @Controlelr
 * remember the mvc will be load on servelet
 */

@Controller("offer")
public class OffersController {


    /**
     * the path which will map the request ("/")
     * @return
     */

    @RequestMapping("/")
    public String showHome() {

        // this name will be translate to view
        return "index";
    }

}
