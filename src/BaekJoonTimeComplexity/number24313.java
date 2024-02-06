package BaekJoonTimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int fn = a1 * n0 + a0;
        int gn = c * n0;
// 전체 식에서 a1과 c에 어떤 상수를 넣었을때 영향이 가면 안되기에 a1 <= c 조건식이 추가로 붙어야한다.
        if(fn <= gn && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
// 7*1 + 7 = 14 14 <= 8 * 1