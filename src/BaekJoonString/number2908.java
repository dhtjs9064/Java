package BaekJoonString;

import java.util.Scanner;

public class number2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int a_reverse = (a % 10) * 100 + ((a / 10) % 10) * 10 + a / 100;
        int b_reverse = (b % 10) * 100 + ((b / 10) % 10) * 10 + b / 100;

        System.out.println(Math.max(a_reverse, b_reverse));
    }
}