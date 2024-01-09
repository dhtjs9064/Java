package BaekJoonLoop;

import java.util.Scanner;

public class number1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int copy = N;
        int count = 0;

        while (true) {
            N = (N % 10) * 10 + ((N / 10 + N % 10)) % 10;
            count++;

            if (copy == N) {
                System.out.println(count);
                break;
            }
        }
    }
}
// 26 / 10 = 몫 : 2, 나머지 : 6
// 따라서 몫은 십의자리수 나머지는 일의자리수