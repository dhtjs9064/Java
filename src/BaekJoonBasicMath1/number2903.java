package BaekJoonBasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int dot = (int) Math.pow((Math.pow(2, N) + 1), 2);
        System.out.println(dot);
    }
}

// 규칙성 :
// 4, 9, 25, 81
// 2(2^0+1)^2, 3(2^1+1)^2, 5(2^2+1)^2, 9(2^3+1)^2, (2^4+1)^2, (2^5+1)^2