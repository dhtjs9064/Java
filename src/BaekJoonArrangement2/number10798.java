package BaekJoonArrangement2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] ch = new char[5][15];
        // max가 필요한 이유 : 가장 큰 길이의 문자열까지 세야함 왜냐하면 나중에 일렬로 셀때 빈칸을 처리해야하기 때문
        int max = 0;

        for (int i = 0; i < ch.length; i++) {
            String st = br.readLine();
            if(max < st.length()) {
                max = st.length();
            }

            for (int j = 0; j < st.length(); j++) {
                ch[i][j] = st.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 가장 긴 것까지는 전부 세주어야하니 먼저 for문에 쓴다
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                // 만약 세다가 빈칸이 있으면 넘어가도록
                if(ch[j][i] == '\0') {
                    continue;
                }
                sb.append(ch[j][i]);
            }
        }

        System.out.print(sb);

    }
}
/*
import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] reader=new String[5];
        // 먼저 총 5개의 줄을 입력받음
        for(int i=0;i<reader.length;i++){
            reader[i]=br.readLine();
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<reader.length;j++){
            // 각 줄마다 문자열의 길이까지만 세도록 if문 설계
                if(i<reader[j].length()){
                // 이중배열이 아니라 1차원배열로 나타낸 것이기에 abcde라면 abcde가 첫번째 배열임
                // 그렇기에 reader[1].charAt(0); 이러면 2번째 배열의 첫번째 문자 즉, abcde말고 다음 배열에 저장된 문자열의 첫번째를 출력하게 되는것
                    System.out.print(reader[j].charAt(i));
                }
            }
        }
    }
}*/
