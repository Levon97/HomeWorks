import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class MergeSort {
    public static int[] mergeSort(int[] arrayToSort) {
        if (arrayToSort.length <= 1) {
            return arrayToSort;
        }
        int a = arrayToSort.length / 2;
        int[] left = new int[a];
        int[] right;
        if (arrayToSort.length % 2 == 0) {
            right = new int[a];
        } else {
            right = new int[a + 1];
        }

        for (int i = 0; i < a; i++) {
            left[i] = arrayToSort[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arrayToSort[a + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

    // Merges the left and right array in ascending order.
    public static int[] merge(int[] left, int[] right) {

        int l = 0;
        int r = 0;
        int i = 0;
        int[] leftRight = new int[left.length + right.length];
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                leftRight[i++] = left[l++];

            }
            leftRight[i++] = right[r++];
        }
        while (l< left.length){
            leftRight[i++] = left[l++];
        }
        while(r<right.length){
            leftRight[i++] = right[r++];
        }
        return leftRight;
    }


    public static void main(String[] args) {
        int[] a = {1, 6, 24, 9, 6};
        System.out.println(Arrays.toString(a));
        ;
        System.out.println(Arrays.toString(mergeSort(a)));

    }
}
