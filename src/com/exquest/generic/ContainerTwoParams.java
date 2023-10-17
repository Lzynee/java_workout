/**
 * 타입 파라미터 두 개를 가지고
 * ContainerTwoParams 제네릭 타입을 사용한다.
 * */

package com.exquest.generic;

// 제네릭 타입
public class ContainerTwoParams<K, V> {
    // 필드
    private K key;
    private V value;


    // 메소드

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
