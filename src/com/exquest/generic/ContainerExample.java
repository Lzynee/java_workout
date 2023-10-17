/**
 * main() 메소드에서
 * Container 제네릭 타입을 사용하는
 * ContainerExample 클래스
 * */

package com.exquest.generic;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
    }
}
