package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            int[] edge = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            
            // 더 좋은 코드
            /*if(numbers[0] + numbers[1] + numbers[2] == 0) {
                break;
            }*/

            if (edge[0] == 0 && edge[1] == 0 && edge[2] == 0) {
                break;
            }

            Arrays.sort(edge);

            if (edge[2] < edge[0] + edge[1]) {
                if (edge[0] == edge[1] && edge[1] == edge[2]) {
                    System.out.println("Equilateral");
                } else if (edge[0] == edge[1] || edge[0] == edge[2] || edge[1] == edge[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
