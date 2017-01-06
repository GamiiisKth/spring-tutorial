package se.joshua.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.joshua.spring.web.dao.User;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha.hasan@gmail.com>}
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }

    @RequestMapping(value = "/newaccount", method = RequestMethod.GET)
    public String showNewAccount(Model model) {

        model.addAttribute("user",new User());
        return "newaccount";
    }

    @RequestMapping(value = "/createaccount", method = RequestMethod.GET)
    public String createAccount() {
        return "accountcreated";
    }
}
