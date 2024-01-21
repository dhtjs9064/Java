package BaekJoonArrangement2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 0 ~ 100까지의 도화지
        boolean[][] paper = new boolean[101][101];
        // 총 검은 영역
        int total = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            for (int j = left; j < left + 10; j++) {
                for (int k = right; k < right + 10; k++) {
                    if(!(paper[j][k])) {
                        paper[j][k] = true;
                        total++;
                    }
                }
            }
        }
        
        System.out.print(total);
    }
}
//계획 : 도화지에 하나씩 칠하는 원리. 칠하면 true, 안 칠하면 false