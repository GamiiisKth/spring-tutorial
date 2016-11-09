package se.joshua.spring.component.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.List;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component-domain.xml");


        try {

            OffersDao offersDao = (OffersDao) context.getBean("offersDao");

            List<Offer> offers = offersDao.getOffer();
            offers.forEach(System.out::println);

        } catch (CannotGetJdbcConnectionException e) {
            System.out.println("can't get jdbc connection");
        } catch (DataAccessException e) {
            e.getStackTrace();
        }

    }
}





