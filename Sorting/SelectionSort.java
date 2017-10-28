import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = {5, 7, 3, 9, 2, 4, 8, 4, 6, 2, 3, 9, 7, 6 ,4};

        for(int i = 0; i < unsorted.length; i++) {
            int min = i;
            for(int j = i; j < unsorted.length; j++) {
                if(unsorted[j] < unsorted[min]) {
                    min = j;
                }
            }

            int temp = unsorted[i];
            unsorted[i] = unsorted[min];
            unsorted[min] = temp;
        }

        System.out.println(Arrays.toString(unsorted));
    }
}