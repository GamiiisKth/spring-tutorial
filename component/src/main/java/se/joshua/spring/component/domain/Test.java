package se.joshua.spring.component.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component-domain.xml");


        try {

            OffersDao offersDao = (OffersDao) context.getBean("offersDao");



            List<Offer> offersList = new ArrayList<Offer>();

            offersList.add(new Offer(4,"Steve", "steve@caveofprogramming.com", "Cash for software."));
            offersList.add(new Offer(5,"Joe", "joe@caveofprogramming.com", "Elegant web design"));

            int[] rvals = offersDao.create(offersList);


            for(int i : rvals){
                System.out.println(i);
            }


            List<Offer> offers = offersDao.getOffer();
            offers.forEach(System.out::println);

        } catch (CannotGetJdbcConnectionException e) {
            System.out.println("can't get jdbc connection");
        } catch (DataAccessException e) {
            e.getStackTrace();
        }

    }



}





