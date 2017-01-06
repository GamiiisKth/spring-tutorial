package se.joshua.spring.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import se.joshua.spring.web.dao.Offer;
import se.joshua.spring.web.service.OfferService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *         <p>
 *         <p>
 *         how the servelet works
 *         http://4.bp.blogspot.com/-RaUWkZ1rurs/U4Q5eFLbxtI/AAAAAAAAFGg/nE-txgGcNcM/s1600/FC.jpg
 *         <p>
 *         to get servelt load this bean and we want the spring to scan this package and find the @Controlelr
 *         remember the mvc will be load on servelet
 */

@Controller
public class OffersController {

    private OfferService offerService;

    @Autowired
    public void setOfferService(OfferService offerService) {
        this.offerService = offerService;
    }


    // se the class DataBaseErrorClass how we catch the exception
    @RequestMapping(value = "/offers", method = RequestMethod.GET)
    public String showOffers(Model model) {

        List<Offer> offers = offerService.getOffers();
        model.addAttribute("offers", offers);

        // this name will be translate to view
        return "offers";
    }

    /**
     * @param model
     * @param id    RequestParam means that the localhost:8080/test/?id=743
     * @return
     */
    @RequestMapping(value = "/offer", method = RequestMethod.GET)
    public String getOffer(Model model, @RequestParam("id") int id) {


        Offer offer = offerService.getOffer(id);
        List<Offer> offers = new ArrayList<>();
        offers.add(offer);

        model.addAttribute("offers", offers);

        // this name will be translate to view
        return "offers";
    }

    /**
     * @param model
     * @param id    RequestParam means that the localhost:8080/test/?id=743
     *              the url excepts when /test path has been accesed it should have a id
     * @return
     */

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTest(Model model, @RequestParam("id") String id) {
        System.out.println("id is :" + id);

        // this name will be translate to view
        return "home";
    }

    @RequestMapping("/createOffer")
    public String createOffer(Model model) {

        return "createOffer";
    }

    @RequestMapping(value = "/doCreate", method = RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("form not valid");

            return "createOffer";

        } else {
            offerService.createOffer(offer);
            System.out.println("form valid");
        }
        System.out.println(offer);

        return "offercreated";
    }


}
