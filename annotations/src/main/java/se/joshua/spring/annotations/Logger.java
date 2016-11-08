package se.joshua.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Logger {
    /**
     * we can use AutoWired by constructor or by fields or by setters
     */

    // @Autowired
    private ConsoleWriter consoleWriter;

    // @Autowired
    private FileWriter fileWriter;

    @Autowired
    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }


    // @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    // @Autowired
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
