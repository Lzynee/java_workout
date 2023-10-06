/**
 * 1부터 100까지의 정수 중에서
 * 3의 배수의 총합을 출력하는 코드
 * */

package com.exquest.controlstmt;

public class MultiplesOfThree {
    public static void main(String[] args) {
        // 변수 설정
        int num = 3;
        int start = 1, end = 100;  // 합을 구할 배수들의 범위
        int sum = 0;  // 배수들의 합을 저장할 변수

        // 범위 내 num의 배수들의 합을 구하기
        for (int i = start; i <= end; i++) {  // 1부터 100까지
            if (i % num == 0)
                sum += i;  // i가 3의 배수이면 합한다.
        }  // for

        // 결과 출력
        System.out.printf("%d부터 %d까지 %d의 배수의 총합: %d", start, end, num, sum);
    }  // main
}  // class
