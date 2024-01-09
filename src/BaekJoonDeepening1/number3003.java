package BaekJoonDeepening1;

import java.util.Scanner;

public class number3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[arr1.length];
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();

            if(arr1[i] != arr2[i]) {
                arr3[i] = arr1[i] - arr2[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
