package com.book.ex;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("영어문장을 입력하세요: ");
            String line = sc.nextLine();
            if("END".equals(line)) {
                break;
            }
            System.out.println(line.toUpperCase());
        }
    }
}
