package BaekJoonTimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int로 할시 제일 큰 수를 집어넣었을 때 오버플로우가 남
        long n = Long.parseLong(br.readLine());

        System.out.println(n * n);
        System.out.println(2);
    }
}
