package baekJoonString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 개수
        String str = br.readLine(); // 숫자들

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - 48; // 숫자들을 하나씩 뗌
        }
        System.out.println(sum);
    }
}