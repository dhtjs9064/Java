package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                sb.append(" ");
            }

            for (int j = 1; j <= i; j++) {
                if(j > 1) {
                    sb.append(" ");
                }
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

// 더 좋은 답 (홀수, 짝수 이용)
//package backJoon;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class number10991 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N - i; j++) {
//                sb.append(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if ((j % 2) == 1) {
//                    sb.append("*");
//                }
//                else {
//                    sb.append(" ");
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.print(sb);
//    }
//}