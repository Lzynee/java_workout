/**
 * 키보드로부터 입력된 데이터로
 * 예금, 출금, 조회, 종료 기능을 제공하는 코드
 * */

package com.exquest.controlstmt;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        while (true) {
            // 작업 처리 전 계좌 정보
            double balance = 0;  // 잔고

            // 입력값 받기
            System.out.println("선택> ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());  // 입력값을 변수 choice에 저장

            if (choice == 1) {
                System.out.println("예금액> ");
                Scanner sc1 = new Scanner(System.in);

                double deposit = (double) (Integer.parseInt(sc1.nextLine()));
                balance += deposit;  // 1을 입력하면 예금액을 입력받고, 잔고 금액을 다시 저장
            } else if (choice == 2) {
                System.out.println("출금액> ");
                Scanner sc2 = new Scanner(System.in);

                double withdrawal = (double) (Integer.parseInt(sc2.nextLine()));
                balance -= withdrawal;  // 2를 입력하면 출금액을 입력받고, 잔고 금액을 다시 저장
            } else if (choice == 3) {
                System.out.printf("잔고>%d", balance);  // 3을 입력하면 잔고를 출력
            } else if (choice == 4) {                
                break;  // 4를 입력하면 프로그램 종료
            }  // if ~ else-if
        }  // while
        System.out.println("프로그램 종료");
    }  // main
}  // class
