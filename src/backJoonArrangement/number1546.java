package backJoonArrangement;

import java.util.Arrays;
import java.util.Scanner;

public class number1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        double[] max = new double[N];

        for (int i = 0; i < max.length; i++) {
            max[i] = sc.nextInt();
        }

        Arrays.sort(max);

        for (int i = 0; i < max.length; i++) {
            sum += (max[i] / max[max.length - 1]) * 100;
        }

        System.out.println(sum / N);
    }
}