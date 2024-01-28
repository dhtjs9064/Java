package BaekJoonGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(br.readLine());
        int width = Integer.parseInt(br.readLine());

        System.out.println(height * width);
    }
}
