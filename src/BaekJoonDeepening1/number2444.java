package BaekJoonDeepening1;

import java.util.Scanner;

public class number2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = 1; l <= n - 1; l++) {
            for (int i = 0; i < l; i++) {
                System.out.print(" ");
            }
            for (int i = 2 * l - 1; i < 2 * n - 2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 뒤에 부분에서 더 나은 코드

/*
        for(int i = N-1; i >= 0 ; i--) {
        이렇게 n - i를 함으로써 다시 1부터 시작됨을 알 수 있음
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
        처음에 i를 n-1로 설정해두었기 때문에 자연스레 전체가 0 ~ 6사이 즉, 별이 7개로 형성됨
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}*/