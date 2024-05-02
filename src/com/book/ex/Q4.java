package com.book.ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws IOException {
        // FileWriter
        FileWriter fw = new FileWriter("c:/java/sample.txt",true);
        System.out.print("문장을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        fw.write(String.format("%s\n",line));
        fw.close();

        // PrintWriter
        PrintWriter pw = new PrintWriter(new FileWriter("c:/java/sample.txt",true));
        System.out.print("문장을 입력하세요: ");
        Scanner sc2 = new Scanner(System.in);
        String line2 = sc.nextLine();
        pw.println(line2);
        pw.close();
    }

}
