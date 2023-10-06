/**
 * 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 프로그램
 * */

package com.exquest.array;

public class TotalSumAndAvgOfMultidimensionalArray {
    public static void main(String[] args) {
        // 배열 선언
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        // 배열 항목의 전체 합 구하기
        int data = 0;  // 배열 항목의 총 개수를 저장할 변수
        int sum = 0;  // 배열 항목의 전체 합을 저장할 변수

        for (int i = 0; i < array.length; i++) {
            data += array[i].length;

            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
            }
        }

        // 배열 항목의 전체 평균 구하기
        double avg = (double) sum / data;

        // 결과 출력
        System.out.printf("배열 항목의 전체 합: %d%n", sum);
        System.out.printf("배열 항목의 전체 평균: %.2f", avg);
    }  // main
}  // class
