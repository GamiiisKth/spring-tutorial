
package se.joshua.spring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import se.joshua.spring.annotations.ConsoleWriter;
import se.joshua.spring.annotations.FileWriter;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class LoggerQualifier {
    /**
     * in the case that we have same  ConsoleWriter class but from different resources or package
     * both are declared  in the xml and with same id how we want to declared which one we want to use
     * <p>
     * or
     * <p>
     * we have ConsoleWriter of same class but it's has been created twice but with different id
     * how we want to tell spring which one will be autoWired to ConsoleWriter
     * <p>
     * solution -> Qualifier
     */


    @Autowired(required = true)
    @Qualifier("toConsole")
    private ConsoleWriter consoleWriter;

    @Autowired(required = false)
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
