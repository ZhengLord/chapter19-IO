package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="d:\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello 中国");
        bufferedWriter.newLine();
        bufferedWriter.write("Come City");
        bufferedWriter.close();
    }
}
