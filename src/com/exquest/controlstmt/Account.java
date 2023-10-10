/**
 * 키보드로부터 입력된 데이터로
 * 예금, 출금, 조회, 종료 기능을 제공하는 프로그램
 * */

package com.exquest.controlstmt;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        int balance = 0;  // 계좌의 잔액

        // 무한 반복문
        while (true) {
            // 프로그램 실행 시 안내 메시지를 출력한다.
            System.out.println();
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }
            System.out.println("\n1.예금 | 2.출금 | 3.잔고 | 4.종료");
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }

            // 실행할 기능에 대한 코드를 사용자로부터 입력 받는다.
            System.out.print("\n선택> ");
            Scanner sc1 = new Scanner(System.in);
            int code = Integer.parseInt(sc1.nextLine());  // 사용자가 선택한 기능

            // 사용자가 입력한 코드에 따라 프로그램을 반복 실행한다.
            if (code == 4) break;  // 코드가 4이면 반복문을 빠져나와 프로그램 종료
            else if (code == 3)  // 코드가 3이면 잔고 출력
                System.out.println("잔고> " + balance);
            else if (code == 1) {  // 코드가 1이면 예금액을 입력 받아 잔고에 더하기
                System.out.print("예금액> ");

                Scanner sc2 = new Scanner(System.in);  // 예금액 입력 받기
                int money = Integer.parseInt(sc2.nextLine());

                balance += money;
            } else if (code == 2) {  // 코드가 2이면 출금액을 입력 받아 잔고에서 빼기
                System.out.print("출금액> ");

                Scanner sc2 = new Scanner(System.in);  // 출금액 입력 받기
                int money = Integer.parseInt(sc2.nextLine());

                balance -= money;
            }  // if ~ else-if
        }  // 무한반복문
        System.out.println("프로그램 종료");// 프로그램 종료 시 메시지 출력
    }  // main
}  // class
