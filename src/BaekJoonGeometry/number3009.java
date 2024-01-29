package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] coordinate1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        // 배열 중간에 이 코드를 써야하는 이유 : 줄마다 토큰으로 나눠야하는데 안쓰면 맨 첨에 쓴 것밖에 남지 않아서 한 줄에 모두 입력해야한다
        st = new StringTokenizer(br.readLine());
        int[] coordinate2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordinate3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        for (int i = 0; i < coordinate1.length; i++) {
            if (coordinate1[i] == coordinate2[i]) {
                System.out.print(coordinate3[i] + " ");
            } else if (coordinate2[i] == coordinate3[i]) {
                System.out.print(coordinate1[i] + " ");
            } else {
                System.out.print(coordinate2[i] + " ");
            }
        }
    }
}
