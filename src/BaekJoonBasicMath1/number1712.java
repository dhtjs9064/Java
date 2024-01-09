package BaekJoonBasicMath1;

import java.io.IOException;
import java.util.Scanner;

public class number1712 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (C > B) {
            int a = A / (C - B);
            System.out.println(a + 1);
        } else {
            System.out.println(-1);
        }
    }
}