package BaekJoonString;

import java.util.Scanner;

public class number9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 테스트 개수
        int T = sc.nextInt();
        
        // charAt 응용
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            sb.append(S.charAt(0)).append(S.charAt(S.length() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}
