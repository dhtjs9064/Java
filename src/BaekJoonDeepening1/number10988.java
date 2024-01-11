package BaekJoonDeepening1;

import java.io.*;

public class number10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int len = word.length();
        int palindrome = 1;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                palindrome = 0;
                break;
            }
        }
        bw.write(palindrome + "\n");
        bw.flush();
        bw.close();
    }
}
