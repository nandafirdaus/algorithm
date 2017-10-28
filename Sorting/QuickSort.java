import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] unsorted = {4, 6, 9, 12, 33, 22, 73, 4, 14, 96, 56, 44, 1, 9, 6, 34, 76, 56, 19, 39};
        
        sort(unsorted, 0, unsorted.length);

        System.out.println(Arrays.toString(unsorted));
    }

    public static void sort(int[] array, int start, int end) {
        if (end - start <= 0) {
            return;
        }
        
        int swapIndex = start + 1;
        for (int i = swapIndex; i < end; i++) {
            if (array[i] < array[start]) {
                swap(array, swapIndex, i);
                swapIndex++;
            }
        }

        swap(array, start, swapIndex - 1);

        sort(array, start, swapIndex - 1);
        sort(array, swapIndex, end);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}