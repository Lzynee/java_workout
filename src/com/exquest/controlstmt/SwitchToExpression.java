/**
 * 100점이면 A등급, 80점이면 B등급, 60점이면 C등급
 * 정규식으로 구한 등급을 grade 문자열에 저장
 * */

package com.exquest.controlstmt;

public class SwitchToExpression {
    public static void main(String[] args) {
        // 변수 설정
        int score1 = 0;  // 점수를 저장할 변수
        String grade = "B";  // 등급을 저장할 문자열

        grade = (score1 == 100) ? "A" : ((score1 == 80) ? "B" : "C");
    }
}
