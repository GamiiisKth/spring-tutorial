package Exception;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
// Demonstrate throw.
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }


    public static void main(String args[]) {




        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e.getMessage()); // this line will only print the message (which is mean 'demo')
            System.out.println("Recaught: " + e); // this line will print the exception class and the message
            System.out.println(e.getStackTrace()[0]); // this line will print the exception line where the exception has been occurred
        }
    }
}