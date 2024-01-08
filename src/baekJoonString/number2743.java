package baekJoonString;

import java.util.Scanner;

public class number2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count = i;
        }
        System.out.println(count + 1);
    }
}
