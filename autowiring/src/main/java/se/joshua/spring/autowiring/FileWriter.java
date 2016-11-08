package se.joshua.spring.autowiring;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class FileWriter implements LoggerWriter {

    @Override
    public void write(String text) {
        System.out.println("File writer: "+ text);
    }
}
