package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class number11720 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
