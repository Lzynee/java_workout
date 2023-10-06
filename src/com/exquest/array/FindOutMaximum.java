/**
 * 주어진 배열 항목에서 최대값을 출력하는 프로그램
 * */

package com.exquest.array;

public class FindOutMaximum {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};  // 배열 선언

        // 가장 큰 값을 찾을 때까지 배열의 항목들을 일대일로 비교
        int maximum = array[0];  // 배열 항목 중 가장 큰 값을 저장할 변수

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];  // i번째 항목의 값이 maximum보다 크면, maximum에 저장
        }

        // 결과 출력
        System.out.println(maximum);
    }  // main
}  // class
