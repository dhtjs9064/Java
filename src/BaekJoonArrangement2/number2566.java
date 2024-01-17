package BaekJoonArrangement2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //출력
        int max = 0;

        /* 몰랐던 부분 : 전부 다 0으로 입력하면 1행 1열이 나와야함
           근데 max = 0으로 초기화했기 때문에 0 > 0이 될 수가 없으므로
           둘 다 1로 초기화를 해두어야 한다 */
        int x = 1;
        int y = 1;


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(x + " " + y);
    }
}
