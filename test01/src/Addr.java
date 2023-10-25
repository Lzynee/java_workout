/**
 * getAddresses() 메소드의 데이터를 저장하여
 * AddrApp에서 호출할 수 있도록 한다.
 * */

public class Addr {
    // 필드 선언
    private int id;
    private String name;
    private String address;
    private String phone;

    // 생성자 선언
    public Addr(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // @Getter, @Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
