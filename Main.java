import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.

        int[] testInput = { 1, 2, 3, 1 };
        int[] array = new int[10];
        int max = 20;
        int min = 1;
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(array, 1);
    }
}
