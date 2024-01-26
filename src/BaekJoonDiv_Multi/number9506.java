package BaekJoonDiv_Multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class number9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 비효율 1: while문 안쪽에서 초기화 했어야함
        ArrayList<Integer> array = new ArrayList<>();
        // 비효율 2: sum을 while문 안쪽에 씀으로써 자동으로 초기화하도록 해야했음
        int sum = 0;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            // 비효율 3: 제곱근까지만 반복했어야 했음
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    // 비효율 4: i < n으로 바꾼다.
                    if (n == i) {
                        break;
                    }
                    array.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                // 비효율 5: StringBuilder를 사용함으로써 성능을 향상시킨다.
                System.out.print(n + " = ");
                for (int i = 0; i < array.size(); i++) {
                    System.out.print(array.get(i));
                    if (i == array.size() - 1) {
                        break;
                    }
                    System.out.print(" + ");
                }
                System.out.println();
            } else {
                // 비효율 6: 루프를 멈춰야하는 -1은 while문 맨 앞에 씀으로써 불필요한 확인을 없앤다
                if (n == -1) {
                    break;
                }
                System.out.println(n + " is NOT perfect.");
                // 비효율 7: 이미 마지막에 clear()를 하니까 불필요한 반복이다.
                array.clear();
            }
            // 비효율 8: 이하동문
            array.clear();
            sum = 0;
        }
    }
}
/*
// 1등 코드 분석

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException{
    // 코드를 쓰기전에 필요한 도구들을 먼저 선언 : 가독성 up
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i, num, sum;
        ArrayList<Integer> divisors;

        while(true) {
            num = Integer.parseInt(br.readLine());
            divisors = new ArrayList<Integer>();
            if(num == -1) break;
            else {
            // 1은 모든 수의 약수이기에 합계를 1부터 시작한다.
                sum = 1;
                // 출력시 공통으로 들어가야하는 수니까 미리 써준다.
                sb.append(num);
                // 약수의 특징 : 어떤 수의 제곱근까지만 알면 그 이후의 약수는 자동으로 알 수 있다.
                // 1은 이미 아니까 2부터 시작하고 동시에 제곱근까지 알 수 있게 하는 i*i를 사용한다.
                for(i = 2 ; i*i < num ; i++) {
                    if(num%i == 0) {
                    // 예를 들어 i가 2이고 num이 28이면 28을 2로 나눈 14도 2와 묶이는 약수이므로 두 약수를 합해서 총 합계에 집어넣는다.
                        sum += (i + num/i);
                        // 그리고 리스트에 추가한다.
                        divisors.add(i);
                        divisors.add(num/i);
                    }
                }
                // 완전제곱근이면 약수가 중복되니까 하나만 넣어 중복 수를 방지한다.
                if(i*i == num) {
                    sum += i;
                    divisors.add(i);
                }
                // 모든 약수의 공통 = 1
                divisors.add(1);
                // 현재 약수가 뒤섞여 들어갔기에 차례대로 출력하기위해 정렬해준다
                Collections.sort(divisors);
                // 완전 수이면
                if(sum == num) {
                    sb.append(" = ");
                    // 향상 for문 : 첫 번째 공간부터 divisors배열의 끝까지 돌음
                    // 이때, n + " + "를 sb에 추가
                    for(int n : divisors) sb.append(n + " + ");
                    // 공백, +, 공백 즉, 총 3개 삭제
                    sb.delete(sb.length()-3, sb.length()-1);
                    sb.append("\n");
                }
                // 완전 수가 아니면
                else sb.append(" is NOT perfect.\n");
            }
        }
        // 문자열 형태이어야하니까 변환
        System.out.print(sb.toString());
    }

}*/
