package BaekJoonArrangement1;

import java.util.Scanner;

public class number8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력
        String[] test = new String[sc.nextInt()];

        for (int i = 0; i < test.length; i++) {
            test[i] = sc.next();
        }

        sc.close();

        //출력

        for (int i = 0; i < test.length; i++) {

            int count = 0; //연속횟수
            int sum = 0; //횟수의 합계

            for (int j = 0; j < test[i].length(); j++) {

                if (test[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }

            System.out.println(sum);
        }
    }
}
