package baekJoonBasicMath1;

import java.util.Scanner;

public class number2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kg = sc.nextInt(); // kg == 11

        if (kg == 4 || kg == 7) {
            System.out.println(-1);
        } else if (kg % 5 == 0) {
            System.out.println(kg / 5);
        } else if (kg % 5 == 1 || kg % 5 == 3) {
            System.out.println(kg / 5 + 1);
        } else if (kg % 5 == 2 || kg % 5 == 4) {
            System.out.println(kg / 5 + 2);
        }
    }
}