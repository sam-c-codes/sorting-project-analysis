public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int num = i;
            for (int j = i+1; j < input.length; j++) {
                if (input[j] < input[num]) {
                    num = j;
                }
            }
            int temp = input[i];
            input[i] = input[num];
            input[num] = temp;
        }
    }
}