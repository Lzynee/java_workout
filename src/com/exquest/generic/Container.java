/**
 * ContainerExample 클래스에서 사용되는
 * Container 제네릭 타입
 * */

package com.exquest.generic;

public class Container<T> {
    private T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
