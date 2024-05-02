package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("c:/java/out.txt");
            for (int i = 1; i < 11; i++) {
                String data = i + " 번째 줄 입니다.\r\n"; // 개행문자
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
