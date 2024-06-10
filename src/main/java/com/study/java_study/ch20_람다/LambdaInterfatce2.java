package com.study.java_study.ch20_람다;

import com.study.java_study.ch18_빌더.A;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterfatce2 {
    Predicate<String> one = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return false;
        }
    };

    Predicate<String> oneDash = s -> true;

    Supplier<Integer> two = new Supplier<Integer>() {
        @Override
        public Integer get() {
            return 888;
        }
    };

    Supplier<Integer> twoDash = () -> 888;

    Consumer<String> three = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println("확인");
        }
    };

    Consumer<String> threeDash = s -> System.out.println("확인");

}
