/**
 * 별을 이등변삼각형 모양으로 출력하는 프로그램
 * */

package com.exquest.controlstmt;

public class PrintStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  // main
}  // class
