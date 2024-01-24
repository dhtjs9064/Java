package BaekJoonDiv_Multi;

import java.io.IOException;
import java.util.Scanner;

public class number5086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                break;
            }
            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else
                System.out.println("neither");
        }
    }
}

// 또 다른 좋은 표본

// 이런식으로 어차피 true로 하면 특정 if조건의 break문을 마주치기 전까진 계속 입력을 반복할 것임
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {

            st = new StringTokenizer(br.readLine()," ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if(first == 0 && second == 0) break;

            if(second % first == 0) {
                sb.append(f);
            }
            else if(first % second == 0) {
                sb.append(m);
            }
            else {
                sb.append(n);
            }

        }
        System.out.println(sb);
    }

}*/
