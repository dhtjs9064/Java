package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        int[][] coordinate = new int[count][2];

        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_min = x_min;
        int y_max = x_max;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());

            x_min = Math.min(x_min, coordinate[i][0]);
            x_max = Math.max(x_max, coordinate[i][0]);
            y_min = Math.min(y_min, coordinate[i][1]);
            y_max = Math.max(y_max, coordinate[i][1]);
        }
        System.out.println((x_max - x_min) * (y_max - y_min));
    }
}

// 내가 쓴 다른 방식의 코드
// 시간 복잡도는 거의 차이가 없다
/*
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x_min = Integer.parseInt(st.nextToken());
        int y_min = Integer.parseInt(st.nextToken());
        int x_max = x_min;
        int y_max = y_min;

        for (int i = 0; i < count - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            x_min = Math.min(x_min, x);
            y_min = Math.min(y_min, y);
            x_max = Math.max(x_max, x);
            y_max = Math.max(y_max, y);
        }

        System.out.println((x_max - x_min) * (y_max - y_min));
    }
}*/
