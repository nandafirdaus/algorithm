import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] unsorted = {6, 4, 3, -5, 10, -7, 25, 0, 4, 8, 9, 2, 3, 6, 4, 1, -12, 100, -50};
    
        for(int i = 0; i < unsorted.length; i++) {
            int temp = unsorted[i];
            for(int j = i; j > 0; j--) {
                if(temp < unsorted[j-1]) {
                    unsorted[j] = unsorted[j-1];

                    if (j == 1) {
                        unsorted[j-1] = temp;
                    }
                } else {
                    unsorted[j] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(unsorted));
    }
}