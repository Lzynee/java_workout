/**
 * 십의 자리 이하를 버리는 프로그램
 * 조건: 산술 연산자만 사용
 * */

package com.exquest.operator;

public class DropUnderTen {
    public static void main(String[] args) {
        int value = 356;

        // value에서 십의 자리 이하인 숫자를 뺀 결과를 출력
        System.out.println(value - (value % 100));  // 356 - 56 = 300
    }
}
