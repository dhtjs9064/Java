package BaekJoonDeepening1;

import java.io.*;
import java.util.StringTokenizer;

public class number25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = new String[20];

        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};


        double total = 0.0;
        double scoreSum = 0.0;

        for (int i = 0; i < 20; i++) {
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");

            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    total += gradeScore[j] * score;
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }
        bw.write(total / scoreSum + "\n");
        bw.flush();
        bw.close();
    }
}
