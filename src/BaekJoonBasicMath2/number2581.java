package BaekJoonBasicMath2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class number2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        int resultSum = 0;
        boolean isPrime = false;
        for (int i = M; i <= N; i++) {
            isPrime = isPrimeNumber(i);
            if (isPrime) { //  true == 소수 (2번) 소수이면 합계에 더하는 식 세우기
                resultSum += i;
                list.add(i);
            }
        }
        if (resultSum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(resultSum);
            System.out.println(list.get(0)); // (3번) 최솟값 즉, 0번째를 나타냄
        }
    }

    public static boolean isPrimeNumber(int n) { //.///// (1번) 소수인지아닌지 판별하는 식
        if (n == 1) {
            return false;
    }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 소수가 아니라면 false 리턴
            }
        }
        return true; // 소수라면 true 리턴
    }
}