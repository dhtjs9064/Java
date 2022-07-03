package baekJoonBasicMath1;

import java.util.Scanner;

public class number10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H_floor = sc.nextInt();
            int W_room = sc.nextInt();
            int N_number = sc.nextInt();

            if(N_number % H_floor == 0) { // 꼭대기 층
                System.out.println((H_floor * 100) + (N_number / H_floor));
            } else {
                System.out.println ((N_number % H_floor) * 100 + (N_number / H_floor) + 1);
            }
        }
    }
}
