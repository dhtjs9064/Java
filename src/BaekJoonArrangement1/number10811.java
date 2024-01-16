package BaekJoonArrangement1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number10811 {
    public static void main(String[] args) throws IOException {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            bucket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            while (j < k) {
                int tmp = bucket[j];
                bucket[j++] = bucket[k];
                bucket[k--] = tmp;
            }
        }

        //출력
        for (int i = 1; i <= N; i++) {
            System.out.print(bucket[i] + " ");
        }
    }
}
