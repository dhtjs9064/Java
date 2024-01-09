package BaekJoonArrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number5597 {
    public static void main(String[] args) throws IOException {
        //입력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[31];

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            n[num] = 1;
        }

        //출력
        for (int i = 1; i <= 30; i++) {
            if (n[i] == 0) {
                System.out.println(i);
            }
        }
    }
}


