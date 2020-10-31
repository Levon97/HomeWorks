import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Task 1. Create an array and fill it with 2 number.");
        int[] array1 = {1, 2};
        System.out.println(Arrays.toString(array1));

        System.out.println("\nTask 2. Create an array and fill it with numbers from 1:1000.");
        int[] array2 = new int[1000];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array2));

        System.out.println("\nTask 3. Create an array and fill it with odd numbers from -20:20.");
        int[] array3 = new int[20];
        for (int i = -19, j = 0; i <= 19; i += 2, j++) {
            array3[j] = i;
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("\nTask 4. Create an array and fill it. Print all elements which can be divided by 5.");
        int[] array4 = {5, 3, 6, 18, 15, 19, 505, 500, 423, 30};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }

        System.out.println("\n\nTask 5.Create an array and fill it. Print all elements which are between 24.12 and 467.23..");
        double[] array5 = {5, 32.12, 6, 18, 25.456, 19, 505, 500, 423, 30};
        for (int i = 0; i < array4.length; i++) {
            if (array5[i] >= 24.12 && array5[i] <= 467.23) {
                System.out.print(array5[i] + " ");
            }
        }


        System.out.println("\n\nTask 6. Create an array and fill it. Print count of elements which can be divided by 2.");
        int[] array6 = {5, 3, 6, 18, 15, 19, 505, 500, 422, 30};
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("\nTask 7. Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "        Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int numToMultiples = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numToMultiples + "x" + i + "=" + numToMultiples * i);
        }
    }

}
