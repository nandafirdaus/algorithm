import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        // int[] unsorted = {5, 7, 3, 9, 2, 4, 8, 4, 6, 2, 3, 9, 7, 6 ,4};
        int[] unsorted = {4, 6, 9, 12, 33, 22, 73, 4, 14, 96, 56, 44, 1, 9, 6, 34, 76, 56, 19, 39};
        
        sort(unsorted, 0, unsorted.length-1);

        System.out.println(Arrays.toString(unsorted));
    }

    public static void sort(int[] array, int start, int end) {
        if (end - start == 0) {
            return;
        }

        int mid = (start+end)/2;

        sort(array, start, mid);
        sort(array, mid + 1, end);

        int index1 = start;
        int index2 = mid + 1;
        int[] temp = new int[end - start + 1];

        for (int i = 0; i < end - start + 1; i++) {
            if (index1 <= mid && index2 <= end) {
                if (array[index1] <= array[index2]) {
                    temp[i] = array[index1];
                    index1++;
                } else {
                    temp[i] = array[index2];
                    index2++;
                }
            } else if (index1 <= mid) {
                temp[i] = array[index1];
                index1++;
            } else {
                temp[i] = array[index2];
                index2++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            array[start + i] = temp[i];
        }
    }
}