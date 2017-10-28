import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args) {

        int[] unsorted = {5, 7, 3, 9, 2, 4, 8, 4, 6, 2, 3, 9, 7, 6 ,4};

        for(int i = 0; i < unsorted.length; i++) {
            for(int j = 0; j < unsorted.length - i - 1; j++) {
                if(unsorted[j] > unsorted[j+1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(unsorted));
    }
}