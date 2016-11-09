package se.joshua.spring.annotations.automaticBeanDiscovery;

import org.springframework.stereotype.Component;
import se.joshua.spring.annotations.LoggerWriter;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
@Component
public class BeanDiscoveryConsoleWriter implements BeanDiscoveryLoggerWriter {

    @Override
    public void write(String text) {
        System.out.println("Console writer: " + text);
    }
}
