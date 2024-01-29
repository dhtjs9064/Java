package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        // 최댓값인 10억을 count에 넘을경우 * 4를 하면 40억 즉, int의 범위 약 20억을 넘어버림
        long count = Long.parseLong(br.readLine());
        
        System.out.println(count * 4);
    }
}
