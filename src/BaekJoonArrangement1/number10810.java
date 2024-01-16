package BaekJoonArrangement1;

import java.io.*;
import java.util.StringTokenizer;

public class number10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력

        // N = 바구니 개수
        int N = Integer.parseInt(st.nextToken());
        // M = i ~ j 까지 k번 공을 넣는 것을 반복할 횟수
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        
        // M개의 줄을 입력할 것들
        for (int i = 0; i < M; i++) {
            // i = 1부터는 여기서부터 시작하기 때문에 다시 br.readline()을 씀으로써 반복으로 쓸 수 있게한다.
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        //출력
        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        bw.flush();
        bw.close();
    }
}
/*
    도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.

        도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.

        공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

        둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)

        도현이는 입력으로 주어진 순서대로 공을 넣는다.*/
// => 5번째는 입력 x = 0, 나머지는 예를 들어 1 2 3이면 "3 3 0 0 0" 이러한 순서로 배열되며 즉, 제시한 그 안의 숫자는 모두 바뀐다.