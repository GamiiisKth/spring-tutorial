package se.joshua.spring.annotations.automaticBeanDiscovery;

import org.springframework.stereotype.Component;
import se.joshua.spring.annotations.LoggerWriter;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

@Component
public class BeanDiscoveryFileWriter implements BeanDiscoveryLoggerWriter {

    @Override
    public void write(String text) {
        System.out.println("File writer: "+ text);
    }
}
