package backJoonArrangement;

import java.util.Scanner;

public class number4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < testcase; i++) {

            int students = sc.nextInt(); // 각 줄의 테스트 케이스 개수 (학생수)
            double[] scores = new double[students];

            double sum = 0;

            for (int j = 0; j < scores.length; j++) {

                scores[j] = sc.nextInt(); // 각 줄의 테스트 케이스의(학생들의) 점수들
                sum += scores[j];
            }

            double average = sum / students;
            double count = 0;
            double percent = 0;

            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > average) {
                    count++;
                }

                percent = count / students * 100;

            }

            System.out.printf("%.3f%%\n", percent);
        }
    }
}
// 마지막에 percent에 식을 바로 대입하면 코드를 더 줄일 수 있음