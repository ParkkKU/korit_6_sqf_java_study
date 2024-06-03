package com.study.java_study.ch17_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
@Data
public class Book {
    private String bookName;
    private String author;

    public boolean run() {
        boolean isRun = true;


        System.out.println("[ 도서 전체 조회 ]");

        return isRun;
    }



}
