package baekJoonFunction;

import java.util.Scanner;

public class number1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(arithmetic_sequence(sc.nextInt()));
        sc.close();
    }

    public static int arithmetic_sequence(int num) {
        int count = 0;

        if (num < 100) {
            return num;
        } else {
            count = 99;
        }

        if (num == 1000) {
            num = 999;
        }

        for (int i = 100; i <= num; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            if ((hundreds - tens) == (tens - units)) {
                count++;
            }
        }
        return count;
    }
}
