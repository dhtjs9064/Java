package BaekJoonCondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());

        if(dice1 == dice2 && dice2 == dice3) {
            System.out.println(10000 + dice1 * 1000);
        } else if(dice1 == dice2) {
            System.out.println(1000 + dice1 * 100);
        } else if(dice2 == dice3) {
            System.out.println(1000 + dice2 * 100);
        } else {
            int max = Math.max(dice1, Math.max(dice2, dice3));
            System.out.println(max * 100);
        }
    }
}