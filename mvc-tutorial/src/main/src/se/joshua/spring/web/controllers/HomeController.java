package se.joshua.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.joshua.spring.web.dao.Offer;

import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

@Controller
public class HomeController {

    /**
     * the path which will map the request ("/")
     * @return
     */
    @RequestMapping("/")
    public String showHome() {

        return "home";
    }

}
