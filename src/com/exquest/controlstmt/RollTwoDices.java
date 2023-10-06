/**
 * 두 개의 주사위를 던졌을 때
 * 눈의 합이 5가 될 때까지 계속 주사위를 던지는 프로그램
 * */


package com.exquest.controlstmt;

public class RollTwoDices {
    public static void main(String[] args) {
        // 눈의 합이 5가 될 때까지 두 주사위를 계속 던지는 무한 반복문
        while (true) {
            int dice1 = (int)(Math.random()*6) + 1;  // 주사위 1의 눈을 저장
            int dice2 = (int)(Math.random()*6) + 1;  // 주사위 2의 눈을 저장

            if (dice1 + dice2 == 5) {  // (1, 4), (4, 1), (2, 3), (3, 2)
                System.out.printf("(%d, %d)%n", dice1, dice2);
                break;  // 눈의 합이 5가 되면 반복문 종료
            } else {
                System.out.printf("(%d, %d)%n", dice1, dice2);  // 5가 아니면 나온 눈을 출력
            }  // if-else
        }  // while

        // 종료 메시지 출력
        System.out.println("두 주사위의 눈의 합이 5입니다. 프로그램을 종료합니다.");
    }  // main
}  // class
