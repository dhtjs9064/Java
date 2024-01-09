package BaekJoonLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int realTotalX = Integer.parseInt(br.readLine());
        int typeN = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0; i < typeN; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int priceA = Integer.parseInt(st.nextToken());
            int countB = Integer.parseInt(st.nextToken());
            total += priceA * countB;
        }

        if(realTotalX == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
