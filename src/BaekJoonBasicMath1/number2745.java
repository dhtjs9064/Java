package BaekJoonBasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        System.out.println(Integer.parseInt(N, B));
    }
}
/* 진법 계산법 : ZZZZZ의 36진법 = 35*36^4 + 35*36^3 + 35*36^2 + 35*36^1 + 35*36^0
즉, 기존 자릿수마다 그 진법의 수를 곱하는데 이때, 왼쪽에서 0부터 세면서 제곱을 행한다 */

// 아스키 코드 이용법 : (Z이면) 'Z'(90) - 'A'(65) + 10 = 35
// 즉, 주어진 수에서 'A'를 빼고 10진법이니 10을 더해주면 된다.