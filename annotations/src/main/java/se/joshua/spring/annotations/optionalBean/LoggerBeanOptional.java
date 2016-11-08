package se.joshua.spring.annotations.optionalBean;

import org.springframework.beans.factory.annotation.Autowired;
import se.joshua.spring.annotations.ConsoleWriter;
import se.joshua.spring.annotations.FileWriter;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class LoggerBeanOptional {

    /**
     * look in the xml file that we have 2 bean which can both be autowired
     * but in case that we want maybe only one of them to be injected
     * or it is required to bee existing a bean in xml of FileWriter
     */

            // remember that required it's using in endpoint model classes
            // which is required from client
    @Autowired(required = false)
    private ConsoleWriter consoleWriter;

    @Autowired(required = true)
    private FileWriter fileWriter;


    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }
}
