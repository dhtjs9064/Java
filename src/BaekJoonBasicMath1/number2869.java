package BaekJoonBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class number2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A_up = Integer.parseInt(st.nextToken());
        int B_down = Integer.parseInt(st.nextToken());
        int V_height = Integer.parseInt(st.nextToken());

        int day = (V_height - B_down) / (A_up - B_down);

        if((V_height - B_down) % (A_up - B_down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
//    int day_sum = 0;
//    int count = 1;
//
//        while (V_height >= day_sum){
//                if(day_sum+A_up<V_height){
//        day_sum+=A_up-B_down;
//        count++;
//        }else{
//        System.out.println(count);
//        break;
//          }
//        }