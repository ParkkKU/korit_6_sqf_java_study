package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김준일" => 999
        String a = "김준일";               // 999 (김준일의 주소)
        String b = new String("김준일");   // 200 (b의 주소) -> 999 (김준일의 주소)

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = new String[] {"김준일", new String("김준일"), null};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        //System.out.println({"a", "b"});

        // 배열 순서 o, 값 중복 o, 크기를 중간에 늘리거나 줄일 수 없음

    }
}
