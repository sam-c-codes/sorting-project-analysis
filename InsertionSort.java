public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            for (int k = i - 1; k >= 0 && temp < input[i]; k--) {
                input[k+1] = input[k];
            input[k] = temp;
            }
        }
    }
}
