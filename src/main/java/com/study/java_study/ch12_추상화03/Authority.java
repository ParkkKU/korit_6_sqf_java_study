package com.study.java_study.ch12_추상화03;

/*
    인터페이스
    1. 일반 클래스와 동일하게 정의할 수 없다.
    2. 일반 변수(멤버 변수)를 정의할 수 없다.
    3. 무조건 상수만 정의할 수 있다.
    4. 일반 메소드(멤버 메소드)를 정의하기 위해서는 default 키워드를 사용하여야 한다.
    5. 추상 메소드를 정의할 때 abstract 키워드를 생략할 수 있다.
    6. 인터페이스 안에 정의되어지는 모든 상수들과 메소드들은 public 접근 지정자를 사용한다.

 */

public interface Authority {
    public String DEFAULT_ROLE = "ROLE_USER";

    //abstract 생략
    public String getAuthority();

    default void printAuthority() {
        System.out.println(DEFAULT_ROLE);
    }
}
