package BaekJoonBasicMath1;

import java.util.Scanner;

public class number2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] APT = new int[15][15]; // 아파트 생성
        for (int j = 0; j < 15; j++) {
            APT[j][1] = 1; // j층 1호
            APT[0][j] = j; // 0층 j호
        }

        for (int j = 1; j < 15; j++) { // 1층 ~ 14층

            for (int l = 2; l < 15; l++) { // 2호 ~ 14호
                APT[j][l] = APT[j][l - 1] + APT[j - 1][l];
            }
        }
// 여기서 이미 아파트는 다 만들어져 있음
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(APT[k][n]);
        }
    }
    // 그 중 k,n에 해당하는 위치를 println한 것
}
