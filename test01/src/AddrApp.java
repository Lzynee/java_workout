import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrApp {

    public static void main(String[] args) {

        // 메소드를 사용하기 위해 DBUtil을 객체화
        DBUtil db = new DBUtil();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("명령어를 입력해 주세요 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                break;

            } else if (cmd.equals("add")) {
                System.out.println("========= 주소록 등록 =========");
                System.out.print("이름 : ");
                String name = scanner.nextLine();

                System.out.print("주소 : ");
                String address = scanner.nextLine();

                System.out.print("전화번호 : ");
                String phone = scanner.nextLine();

                db.insertAddress(name, address, phone);

                System.out.println("\n주소록 등록 완료.");
                System.out.println("==============================");

            } else if (cmd.equals("list")) {

                ArrayList<Addr> addrList = db.getAddresses();

                // 자바 콘솔에 출력되는 부분
                // addrList의 값을 하나씩 받아 온다.
                for (int i = 0; i < addrList.size(); i++) {

                    System.out.println("========= 주소록 목록 =========");
                    System.out.println("번호 : " + addrList.get(i).getId());
                    System.out.println("이름 : " + addrList.get(i).getName());
                    System.out.println("주소 : " + addrList.get(i).getAddress());
                    System.out.println("전화번호 : " + addrList.get(i).getPhone());
                }

                System.out.println("==============================");

            } else if (cmd.equals("update")) {
                System.out.print("몇번 주소록을 수정하시겠습니까 : ");

            } else if (cmd.equals("delete")) {
                System.out.println("delete 기능 구현");
                System.out.print("몇번 주소록을 삭제하시겠습니까 : ");

            }  // if ~ else-if

        }  // while

    }  // main

}  // class
