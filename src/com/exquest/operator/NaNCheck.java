/**
 * % 연산을 수행한 결과값에 10을 더하고
 * NaN 값 검사해 올바른 결과를 출력하는 코드
 * */

package com.exquest.operator;

public class NaNCheck {
    public static void main(String[] args) {
        // 변수 설정
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;

        // NaN 값을 검사하고 결과를 출력
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }  // if-else
    }  // main
}  // class
