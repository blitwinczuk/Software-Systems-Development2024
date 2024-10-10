import java.util.Random;

/**
 * Driver class
 */

public class Driver {
    public static void main(String[] args) {final int VALUES = 12;

        Stats stats = new Stats(VALUES);

        Random random = new Random();

        for (int i = 0; i < VALUES; i++) {

            stats.addValue(random.nextInt(100));
        }
        /**
         * system output
         */
        System.out.println("Numbers stored : ");
        System.out.println(stats);

        System.out.println("Average = " + stats.getAverage()); //average of value
        System.out.println("Count = " + stats.getCount()); //count of value
        System.out.println("Total = " + stats.getTotal()); //total of value
        System.out.println("Minimum value = " + stats.getB()); // minimum of value
        System.out.println("Maximum value = " + stats.getA()); // maximum of value
    }}
