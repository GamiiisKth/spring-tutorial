package se.joshua.spring.autowiring;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class LoggerByName {

    /**
     * difference between this class and LoggerByType is, that byType can find the references for property
     * but in this case we have LoggerWriter interface which has 2 has been implemented by 2 class
     * and the question is which of the implementation will be inject to the LoggerWriter and
     * this can be resolved by AutoWiring by Name (if we want to inject the interface by autowiring)
     */


    private LoggerWriter fileWriter;
    private LoggerWriter consoleWriter;

        //set will be used by spring for autoWireByName  (id="fileWriter")
    public void setFileWriter(LoggerWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    //set will be used by spring for autoWireByName ()
    public void setConsoleWriter(LoggerWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

}
