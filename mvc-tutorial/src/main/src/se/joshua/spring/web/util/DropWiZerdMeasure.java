package se.joshua.spring.web.util;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class DropWiZerdMeasure {

    private static Queue queue = new LinkedBlockingQueue(10);
    private static final int FIBO_VALUE = 50000;

    // container for all your application’s metrics.
    static final MetricRegistry metrics = new MetricRegistry();
    //private static final Counter pendingJobs = metrics.counter(name(DropWiZerdMeasure.class, "pending-jobs"));
    private static final Meter requestsSet = metrics.meter("requestsSet");
    private static final Meter requestsGet = metrics.meter("requestsGet");



    static DropWiZerdMeasure dropWiZerdMeasure = new DropWiZerdMeasure();

    public static void main(String args[]) {


        startReport();
        startJob();
        wait5Seconds();
    }

    static void startReport() {
        ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build();
        reporter.start(1, TimeUnit.SECONDS);
    }

    static void wait5Seconds() {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
        }
    }


    public static void doJob(int i) {


        System.out.println(requestsGet.getCount());
        int current = i;
        while (i > 1) {
            i--;
            current = current * i;
        }
    }

    public static void startJob() {
        int current = FIBO_VALUE;

        while (queue.isEmpty()) {
            Timer timer = metrics.timer("produce-value");

            queue.add(current);

            requestsSet.mark();


            fibonacciLoop(current);
        }
        current--;
    }
    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number*10000; i++) {
            fibonacci = fibo1 + fibo2 ; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }


        queue.remove();
        requestsGet.mark();
        System.out.println(Math.round(requestsGet.getMeanRate()));
        return fibonacci; // Fibonacci number
    }

}
