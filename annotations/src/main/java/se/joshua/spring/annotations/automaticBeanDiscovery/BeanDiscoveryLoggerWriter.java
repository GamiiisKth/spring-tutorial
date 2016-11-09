package se.joshua.spring.annotations.automaticBeanDiscovery;

import org.springframework.stereotype.Component;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

public interface BeanDiscoveryLoggerWriter {

    public void write(String text);
}
