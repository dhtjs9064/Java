package BaekJoonTimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());
// for문 그대로 i~n까지 더하는게 아니라 i~n까지의 횟수를 세는 것
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}