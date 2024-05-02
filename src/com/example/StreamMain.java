package com.example;

import java.io.*;

public class StreamMain {
    public static void main(String[] args) throws IOException { // 입출력 예외 처리

        // FileWriter
        FileWriter fw = new FileWriter("c:/java/out1.txt");
        for (int i = 1; i < 11; i++) {
            fw.write(i + " 번째 줄 입니다.\n");
        }
        fw.close();

        // PrintWriter
        PrintWriter pw = new PrintWriter("c:/java/out2.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄 입니다.";
            pw.println(data);
        }
        pw.close();

        // FileWriter Update
        FileWriter fw2 = new FileWriter("c:/java/out1.txt",true);   // append 추가 허용
        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄 입니다.";
            fw2.write(data + "\n");
        }
        fw2.close();

        // PrintWriter Update
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/java/out2.txt",true)); // append 추가 허용
        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄 입니다.";
            pw2.write(data + "\n");
        }
        pw2.close();

        // FileInputStream Read
        byte[] b = new byte[1024];  // 2^10
        FileInputStream input = new FileInputStream("c:/java/out.txt");
        input.read(b);
        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        input.close();

        // 한 줄씩 파일 내용 읽기
        BufferedReader br = new BufferedReader(new FileReader("c:/java/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}
