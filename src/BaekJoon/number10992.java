package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < 2 * N; j++) { // 열의 범위는 별 찍기-16과 동일하다.
                if (j > N + i) {
                    break;
                }// 마지막 별을 찍었으면 반복문을 벗어난다.
                if (i == N - 1) { // 마지막 행에 도착하면 모든 열에 별을 찍는다.
                    sb.append("*");
                    continue;
                }
                if (j == N - i || j == N + i) { // 범위의 양 끝에 별을 찍는다.
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
// 2 = 3
// 3 = 5
// 4 = 7
// 5 = 9
// k = 2n-1