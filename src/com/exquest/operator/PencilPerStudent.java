/**
 * 연필을 학생들에게 똑같은 개수로 나누어 줄 때
 * 1인당 가질 수 있는 연필의 개수와
 * 마지막에 남는 연필의 개수를 구하는 프로그램
 * */


package com.exquest.operator;

public class PencilPerStudent {
    public static void main(String[] args) {
        // 변수 설정
        int pencils = 534;  // 연필의 개수
        int students = 30;  // 학생 수

        // 학생 한 명이 가지는 연필 수 출력
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        // 남은 연필 수 출력
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);
    }  // main
}  // class
