package se.joshua.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.joshua.spring.web.dao.Offer;
import se.joshua.spring.web.dao.OffersDao;

import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */


/*service annotation*/
@Service
public class OfferService {

    private OffersDao offersDao;

    @Autowired
    // we can use @Resource annotation it's have same behaviour as AutoWired
    public void setOffersDao(OffersDao offersDao) {
        this.offersDao = offersDao;
    }

    public List<Offer> getOffers() {
        return offersDao.getOffers();
    }


    public void createOffer(Offer offer) {
        offersDao.create(offer);
    }

    public Offer getOffer(int id) {
      return   offersDao.getOffer(id);
    }

}
