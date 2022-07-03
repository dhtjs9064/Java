package baekJoonBasicMath2;

import java.util.Scanner;

public class number1978 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {

            boolean inPrime = true;

            int number = sc.nextInt();

            if (number == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(number); j++) {

                if (number % j == 0) {
                    inPrime = false;
                    break;
                }
            }
            if(inPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}