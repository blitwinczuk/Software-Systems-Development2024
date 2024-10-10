import java.util.Arrays;

/**
 * The Stats class provides methods to manage and analyse a collection of integer values
 */
public class Stats {

    /**
     * An array which stores the list of numeric values
     */
    int[] numbers;
    int count;

    /**
     * method to add value
     * @param value added to actual array
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;}

    /**
     *
     * method to count length of numbers
     */
    public int getCount() {
        return numbers.length;
    }

    /**
     * method to get an average of numbers
     * @return the average/sum of numbers in array
     */
    public int getAverage(){
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    /**
     *
     * @return the maximum numbers in array
     */
    public int getA() {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)				max = numbers[i];		}

        return max;
    }

    /**
     *
     * @return the minimum number in array
     */
    public int getB() {int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    /**
     *
     * @return total numbers for an array
     */
    public int getTotal() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }		return total;
    }

    public double get() {

        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            x += numbers[i];
        }

        double y = x/(double)numbers.length;

        return y;
    }

    /**
     *
     * @return the string of values from numbers array
     */
    @Override
    public String toString() {return Arrays.toString(numbers);
    }

    /**
     *
     * @param capacity of numbers in an array
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }






}
