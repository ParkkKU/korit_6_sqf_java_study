package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 목록");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            String[] newBooks = null;
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    newBooks = new String[books.length + 1];
                    for (int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    System.out.print("등록하고자 하는 도서명을 입력하세요: ");
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("수정하고자 하는 도서명을 입력하세요: ");
                    String modifyBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndex(books, modifyBook);
                    if(findIndex == -1) {
                        System.out.println("존재하지 않는 도서명입니다.");
                        break;
                    }
                    System.out.print("수정할 도서명을 입력하세요: ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제하고자 하는 도서명을 입력하세요: ");
                    String deleteBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndex(books, deleteBook);
                    if (findIndex == -1) {
                        System.out.println("존재하지 않는 도서명입니다.");
                        break;
                    }
                    newBooks = new String[books.length - 1];

                    for (int i = 0; i < newBooks.length; i++) {
                        if (i < findIndex) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    books = newBooks;
                    System.out.println(deleteBook + "을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[전체 도서 목록 조회]");
                    if(books.length < 1) {
                        System.out.println("등록된 도서가 없습니다.");
                        break;
                    }
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + "번 : " + books[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
            System.out.println();
        }
    }
}
