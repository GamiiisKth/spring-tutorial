package se.joshua.spring.annotations.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import se.joshua.spring.annotations.ConsoleWriter;
import se.joshua.spring.annotations.FileWriter;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class LoggerInject {

    @Inject
   // @Named(value = "consoleWriter2")
    private ConsoleWriter consoleWriter;

    @Inject
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
