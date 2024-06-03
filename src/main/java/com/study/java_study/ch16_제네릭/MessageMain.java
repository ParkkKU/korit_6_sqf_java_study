package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // 하행, String을 상속 받은 애들과 자신만(나보다 하인)
        Message<? super String> m4 = new Message<>("10"); // 상행, 나 자신보다 위로 다 됨

        String s2 = m3.getMessage();
    }
}
