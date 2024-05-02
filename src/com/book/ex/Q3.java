package com.book.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/java/sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("c:/java/sample.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
