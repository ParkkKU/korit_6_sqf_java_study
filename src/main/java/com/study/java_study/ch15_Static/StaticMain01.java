package com.study.java_study.ch15_Static;

public class StaticMain01 {
/*
    스태틱(Static)
    1. 공유 영역
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다.
 */

    public static void main(String[] args) {
        System.out.println(Static01.num);
        Static01.num = 20;
        System.out.println(Static01.num);

        Static01 static01 = new Static01();
        static01.num = 30;
        System.out.println(Static01.num);
    }
}
