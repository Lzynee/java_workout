/**
 * Student 객체를 동등 비교하기 위해
 * hashCode()와 equals() 메소드를 재정의
 *
 * 학생 번호와 이름으로 해시코드를 생성하고,
 * 학생 번호와 이름이 동일할 경우에만 true를 리턴한다.
 * */

package com.exercise.jbmodule.objclazz;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }

    // Object의 hashCode() 메소드를 재정의
    // 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴한다.
   /* @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode();
    }*/

    // Object의 equals() 메소드를 재정의
    // 학생 번호와 이름이 같으면 true를 리턴한다.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student target = (Student) obj;
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return  false;
    }
}
