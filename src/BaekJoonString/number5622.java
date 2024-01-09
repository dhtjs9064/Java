package BaekJoonString;

import java.util.Scanner;

public class number5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                if (s.charAt(i) - 'A' <= 2) {
                    sum += 3;
                } else if (s.charAt(i) - 'A' >= 3 && s.charAt(i) - 'A' <= 5) {
                    sum += 4;
                } else if (s.charAt(i) - 'A' >= 6 && s.charAt(i) - 'A' <= 8) {
                    sum += 5;
                } else if (s.charAt(i) - 'A' >= 9 && s.charAt(i) - 'A' <= 11) {
                    sum += 6;
                } else if (s.charAt(i) - 'A' >= 12 && s.charAt(i) - 'A' <= 14) {
                    sum += 7;
                } else if (s.charAt(i) - 'A' >= 15 && s.charAt(i) - 'A' <= 18) {
                    sum += 8;
                } else if (s.charAt(i) - 'A' >= 19 && s.charAt(i) - 'A' <= 21) {
                    sum += 9;
                } else if (s.charAt(i) - 'A' >= 22 && s.charAt(i) - 'A' <= 25) {
                    sum += 10;
                }
            }
        }
        System.out.println(sum);
    }
}
