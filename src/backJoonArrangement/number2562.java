package backJoonArrangement;

import java.util.Scanner;

public class number2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max= 0;
        int count = 0;

        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            if (max <= n) {
                max = n;
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}