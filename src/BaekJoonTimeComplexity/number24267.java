package BaekJoonTimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}
// n = 7
// i = 1 ~ 5, 2 ~ 5.... -> 54321 n - 2
// j = 2 ~ 6, 3 ~ 6, 4 ~ 6, 5 ~ 6, 6 -> 54321, 4321, 321, 21, 1 -> n
// k = 3 ~ 7, 4 ~ 7, 5 ~ 7, 6 ~ 7 , 7 => n * (n - 1) / 2 -> n-1
//