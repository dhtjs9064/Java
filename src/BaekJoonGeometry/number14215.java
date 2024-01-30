package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] edge = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        Arrays.sort(edge);
        
        // 더 간편한 코드
        // System.out.println((s[0]+s[1]) * 2 - 1);
        
        int sum = edge[0] + edge[1] + edge[2];
        int reduce_edge = edge[2] - (edge[0] + edge[1]) + 1;
        int result = sum - reduce_edge;

        if(edge[2] >= edge[0] + edge[1]) {
            System.out.println(result);
        } else {
            System.out.println(sum);
        }
    }
}
