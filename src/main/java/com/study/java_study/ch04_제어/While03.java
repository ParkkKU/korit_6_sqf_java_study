package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");
            System.out.println();

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    boolean isRunmenu2 = true;
                    while (isRunmenu2) {
                        System.out.println("[회원 등록]");
                        System.out.println("1. 신규 회원 등록");
                        System.out.println("2. 기존 회원 재등록");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println();

                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();

                        switch (selectedMenu) {
                            case "1":
                                System.out.println("신규 회원 등록을 합니다.");
                                break;
                            case "2":
                                System.out.println("기존 회원 재등록을 합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunmenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                isRunmenu2 = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                                break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    isRunmenu2 = true;
                    while (isRunmenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println();

                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();

                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunmenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                isRunmenu2 = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                                break;
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
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

        System.out.println("프로그램 종료");
    }
}
