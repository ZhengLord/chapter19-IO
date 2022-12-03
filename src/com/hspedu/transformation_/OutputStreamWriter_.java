package com.hspedu.transformation_;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="d:\\hsp.txt";
        String charSet="UTF-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),charSet);
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("保存文件成功");
    }
}
