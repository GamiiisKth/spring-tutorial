package se.joshua.autowiring;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ConsoleWriter implements LoggerWriter {

    @Override
    public void write(String text) {
        System.out.println("Console writer: "+ text);
    }
}
