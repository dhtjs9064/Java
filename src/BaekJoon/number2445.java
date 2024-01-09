package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb1.append("*");
            }
            for (int k = 1; k <= 2 * (N - i); k++) {
                sb1.append(" ");
            }
            for (int f = 1; f <= i; f++) {
                sb1.append("*");
            }
            sb1.append("\n");
        }
        System.out.print(sb1);

        for (int i = N - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                sb2.append("*");
            }
            for (int k = 1; k <= 2 * (N - i); k++) {
                sb2.append(" ");
            }
            for (int f = 1; f <= i; f++) {
                sb2.append("*");

            }
            sb2.append("\n");
        }
        System.out.print(sb2);
    }
}