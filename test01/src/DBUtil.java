import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * main에서 작동시킬 데이터 처리
 * 메소드를 기능 단위로 구분하여 생성
 * */

public class DBUtil {
    // jdbc 관련 변수
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/test01";
    String user = "root";
    String pass = "12345";
    // jdbc 드라이버 관련 변수 끝


    // connection을 획득하는 메소드 선언
    public DBUtil() {
        conn = getConnection();
    }
    public Connection getConnection() {

        Connection conn = null;

        try {
            // 1. 드라이버 세팅
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connection 획득
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("DB 작업중 문제 발생");
            e.printStackTrace();

        }  // try ~ catch

        return conn;

    }  // getConnection()

    // 데이터를 처리하는 db 작업 관련 메소드들을 기능별로 분리
    // 주소록에 새 데이터를 입력하는 기능
    public void insertAddress(String name, String address, String phone) {
        // 3. statement 생성
        try {
            stmt = conn.createStatement();

            // 4. sql 처리하기
            String sql = "INSERT INTO t_address\n" +
                    "SET `name` = '" + name + "',\n" +
                    "address = '" + address + "',\n" +
                    "phone = '" + phone + "'";

            // 4.1. 결과 받아오기
            // 조회 결과가 있으면 rs = stmt.executeQuery(sql)
            // 조회 결과가 없는 경우에는 ResultSet으로 받아올 게 없기 때문에
            // sql만 반영해주는 executeUpdate(sql) 사용
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println("ADD DB 작업 중 문제 발생!");
            e.printStackTrace();
        }

        // statement, resultset 설정 끝
    }  // insertAddress()

    // 입력된 데이터를 받아 오는 기능
    public ArrayList<Addr> getAddresses() {
        // 저장하는 리스트가 손실되지 않도록 배열을 설정한다.
        ArrayList<Addr> AddrList = new ArrayList<>();

        try {
            stmt = conn.createStatement();

            String sql = "select * from t_address";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String phone = rs.getString("phone");

                Addr addr = new Addr(id, name, address, phone);
                AddrList.add(addr);
            }  // while

        } catch (Exception e) {
            System.out.println("list DB 작업 중 문제 발생!");
            e.printStackTrace();

        }  // try ~ catch

        return AddrList;
    }  // getAddresses()

    // 입력되어 있던 데이터를 수정하는 기능
    public void editAddresses() {

    }
}  // class
