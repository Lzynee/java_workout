/**
 * 미지수 x와 y가 10 이하의 자연수일 때,
 * 방정식 4x + 5y = 60의 모든 해를 구해서 출력하는 코드
 * */

package com.exquest.controlstmt;

public class Equation {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4*x + 5*y == 60)
                    System.out.printf("(%d, %d)%n", x, y);
            }
        }
    }  // main
}  // class
