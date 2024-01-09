package BaekJoonArrangement;

import java.io.*;
import java.util.StringTokenizer;

public class number10813 {
    public static void main(String[] args) throws IOException {
        // br을 쓰는 이유 : 시스템 속도를 향상시키기 위해
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 토크나이저를 쓰는 이유 : 뒤에 반복문도 쓸 것이고 간편하게 사용하기 위해
        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N = 바구니 개수
        int N = Integer.parseInt(st.nextToken());
        // M = 줄 개수(교환 횟수)
        int M = Integer.parseInt(st.nextToken());

        // 바구니 N개의 배열화 -> 각각 바구니마다 번호를 매겨야 하므로
        int[] arrN = new int[N];

        // 바구니마다 번호를 매김, 공 번호[배열 번호] = 바구니 번호[배열 칸] 같으니까 바구니를 바꾸는 것이나 마찬가지임
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = i + 1;
        }


        // M줄 만큼 I, J 바구니 교환
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            int temp = arrN[I - 1];
            arrN[I - 1] = arrN[J - 1];
            arrN[J - 1] = temp;
        }

        //출력
        for (int k = 0; k < arrN.length; k++) {
            bw.write(arrN[k] + " ");
        }

        bw.flush();
        bw.close();
    }
}
