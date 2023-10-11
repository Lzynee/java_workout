/**
 * 학생들의 점수를 분석하는 프로그램
 *
 * 학생 수와 각 학생들의 점수를 입력받고
 * 최고 점수 및 평균 점수를 출력한다.
 * */

package com.exquest.array;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreAnalysis {
    public static void main(String[] args) {
        // 변수 설정
        int numOfStudent = 0;  // 학생 수를 저장할 변수
        int[] scores = new int[numOfStudent];  // 학생들의 점수를 저장할 배열
        int highestScore = 0;  // 최고 점수를 저장할 변수
        double scoreAvg = 0;  // 평균 점수를 저장할 변수
        boolean run = true;

        // 무한 반복문
        while (run) {
            // 프로그램 시작 메시지 출력
            for (int i = 0; i<50; i++) {
                System.out.print("-");
            }
            System.out.println("\n1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            for (int i = 0; i<50; i++) {
                System.out.print("-");
            }

            // 사용자 입력값 받기
            System.out.print("\n선택> ");
            int option = inputInteger();  // 입력값을 option에 저장

            // 입력값에 따라 기능을 실행한다.
            switch (option) {
                case 1:  // 첫 입력값이 1이면 학생 수를 입력 받는다.
                    System.out.print("학생 수> ");
                    numOfStudent = inputInteger();  // 입력값을 numOfStudent에 저장
                    break;

                case 2:  // 첫 입력값이 2이면 학생들의 점수를 입력 받아 저장한다.
                    scores = addScoresToList(numOfStudent).clone();  // // 점수 리스트를 생성하는 메소드 호출
                    break;

                case 3:  // 첫 입력값이 3이면 점수 리스트를 출력
                    for (int i = 0; i < scores.length; i++) System.out.printf("scores[%d]: %d%n", i, scores[i]);
                    break;

                case 4:  // 첫 입력값이 4이면 최고 점수와 평균 점수를 출력
                    // 최고 점수를 구한다.
                    highestScore = findMaximum(scores);  // 정수값들의 배열에서 최고값을 구하는 메소드 호출

                    // 평균 점수를 구한다.
                    int scoreTotal = Arrays.stream(scores).sum();  // 점수 총합 구하기

                    if (Double.isInfinite(scoreAvg) || Double.isNaN(scoreAvg))  // 예외값 NaN 처리
                        System.out.println("값을 산출할 수 없습니다. 학생 수와 점수의 정보를 확인해 주세요.");
                    else
                        scoreAvg = (double) scoreTotal / numOfStudent;

                    // 최고 점수와 평균 점수를 출력한다.
                    System.out.println("최고 점수: " + highestScore);
                    System.out.printf("평균 점수: %.1f", scoreAvg);
                    System.out.println();
                    break;

                case 5:  // 첫 입력값이 5이면 종료 메시지를 출력하고 프로그램 종료
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
            }  // switch
        }  // while
    }  // main


    // 메소드 선언
    // 사용자의 입력값을 정수로 변환해 저장하는 메소드
    static int inputInteger() {
        Scanner sc = new Scanner(System.in);
        int integer = Integer.parseInt(sc.nextLine());
        return integer;
    }  // inputInteger()

    // 학생 수만큼 점수를 입력 받아 배열에 저장하는 메소드
    static int[] addScoresToList(int numOfStudent) {
        int[] scores = new int[numOfStudent];  // 각 학생들의 점수를 저장할 배열

        for (int i = 0; i < numOfStudent; i++) {  // 학생 수만큼 점수들을 입력 받기
            System.out.print("scores[" + i + "]> ");
            scores[i] = inputInteger();  // 입력값을 정수로 변환해 score[]의 각 인덱스에 저장
        }
        return scores;
    }  // addScoresToList()

    // 정수들의 배열에서 최고값을 찾아 반환하는 메소드
    static int findMaximum(int[] integers) {
        int maximum = 0;  // 최고값을 저장할 변수

        for (int i = 0; i < integers.length; i++) {  // 최고값 구하기
            if (integers[i] > maximum) {
                maximum = integers[i];  // integers에서 가장 큰 수를 구하여 maximum에 저장
            }
        }
        return maximum;
    }  // findMaximum()
}  // class
