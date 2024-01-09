package BaekJoonLoop;

import java.util.Scanner;

public class number2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; N <= i; i--) {
            if(N >= 1) {
                System.out.println(N--);
            }
        }
    }
}
