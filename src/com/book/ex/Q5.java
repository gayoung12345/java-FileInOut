package com.book.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) throws IOException {
        // sample1.txt 파일을 읽어, 줄 단위로 리스트 변수에 저장
        ArrayList<String> data = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("c:/java/sample1.txt"));
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            data.add(line);
        }
        br.close();
        // 줄 단위로 읽으면 줄바꿈 문자가 없어지므로, 개행문자를 포함
        String text = String.join("\n", data);
        // python -> java
        text = text.replaceAll("python", "java");
        // 변경사항을 파일에 작성
        FileWriter fw = new FileWriter("c:/java/sample1.txt");
        fw.write(text);
        fw.close();
    }
}
