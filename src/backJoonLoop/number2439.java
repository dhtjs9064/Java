package backJoonLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
// 별 개수에 맞추어 띄어쓰기 개수가 감소하는 형식