package se.joshua.spring.annotations.automaticBeanDiscovery;

import se.joshua.spring.annotations.ConsoleWriter;
import se.joshua.spring.annotations.FileWriter;

import javax.inject.Inject;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class LoggerBeanDiscovery {


    /***
     * the idea behind this class is that the required bean
     * which must bee injected doesn't need to be created
     * i xml,
     * (1) we  need use @Componnet scane interface implemented classes
     * (2) we need add component scan schema to xml
     */


    @Inject
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
