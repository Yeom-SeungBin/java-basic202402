package video.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUi {

    private static Scanner sc = new Scanner(System.in);

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int inputInteger(String message) {
        System.out.print(message);
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("# 올바른 정수 입력값이 아닙니다!");
        } finally {
            sc.nextLine(); // try(엔터 입력값)에서도, catch(쓰레기 문자열 수거)에서도 nextLine()이 동작해야 함.
        }
        return num; // 정수가 제대로 입력이 되지 않으면 0이 리턴
    }

    public static void makeLine() {
        System.out.println("======================================");
    }

    // 시작 화면 출력
    public static void startScreen() {
        System.out.println("\n========= DVD 대여 관리 시스템 =========");
        System.out.println("### 1. 회원 관리 시스템");
        System.out.println("### 2. 대여 주문 관리 시스템");
        System.out.println("### 3. 영화 DVD 관리 시스템");
        System.out.println("### 4. 프로그램 종료");
        makeLine();
    }

    // 회원 관리 시스템 화면 출력
    public static void userManagementScreen() {
        System.out.println("\n========= 회원 관리 시스템 =========");
        System.out.println("### 1. 신규 회원 추가");
        System.out.println("### 2. 회원 검색");
        System.out.println("### 3. 회원 탈퇴");
        System.out.println("### 4. 첫 화면으로 가기");
        makeLine();
    }

}

















