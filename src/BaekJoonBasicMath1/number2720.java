package BaekJoonBasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        // 좋은 풀이
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < T; i++) {
            int cent = Integer.parseInt(br.readLine());
            sb.append(cent / quarter + " ");

            cent %= quarter;
            sb.append(cent / dime + " ");

            cent %= dime;
            sb.append(cent / nickel + " ");

            cent %= nickel;
            sb.append(cent / penny + "\n");
        }
        System.out.print(sb);
    }
}
// 미국 동전 단위: 1 cent = 1 penny, 5 cents = 1 nickel, 10 cents = 1 dime, 25 cents = 1 quarter
// ex) $1.24 = 4 quarter($1) + 2 dime + 0 nickel, + 4 penny

// 내 풀이

/*
    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int penny = 0;

        for (int i = 0; i < T; i++) {
        int cent = Integer.parseInt(br.readLine());
        quarter = cent / 25;
        dime = (cent - quarter * 25) / 10;
        nickel = (cent - quarter * 25 - dime * 10) / 5;
        penny = cent - quarter * 25 - dime * 10 - nickel * 5;
        System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }*/
