package Exception;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ExceptionTutorial {


    private static class Exception1 {

        private int dividerByZero(int divideBy)  {
            int a = 0;
            try {
                a = divideBy / 0;
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero"+ "\n"+e);
            }
            return a;
        }
    }


    private static class Divider {

        Exception1 exception1 = new Exception1();

        private int divide(int i) {
            try {
                return exception1.dividerByZero(i);
            } catch (ArithmeticException e) {
                System.out.println("the exception has been thrown by the first method " +
                        "but it can be caught by catch statement");
                System.out.println("ArithmeticException has been occurred"+ e);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Divider divider = new Divider();

        System.out.println(divider.divide(1000));

    }
}
