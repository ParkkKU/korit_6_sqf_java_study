package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "";   // 값의 자료형 String
        String phone = null;    // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        // == 은 값 비교 x, 주솟값 비교 o
        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        }

        if (stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if (stringUtils.isEmpty(text)) {
            System.out.println("text가 비어있습니다.");
            return;
        }

    }
}
