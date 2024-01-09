package BaekJoonCondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number2525 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int CookH = Integer.parseInt(br.readLine());

        //출력

        if(M <= 60) {
            H = H + (M + CookH) / 60;
            M = (M + CookH) % 60;
        } else {
            M += CookH;
        }
        if(H >= 24) {
            H -= 24;
        }
        System.out.println(H + " " + M);
    }
}
