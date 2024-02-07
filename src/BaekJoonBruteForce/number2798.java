package BaekJoonBruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int cards = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        int[] list = new int[cards];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < cards; i++) {
            for (int j = i + 1; j < cards; j++) {
                for (int k = j + 1; k < cards; k++) {
                    sum = list[i] + list[j] + list[k];
                    if (sum > max && sum <= number) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
