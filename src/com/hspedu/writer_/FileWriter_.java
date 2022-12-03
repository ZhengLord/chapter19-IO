package com.hspedu.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath="d:\\note.txt";
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(filePath);//会在D盘创建一个note.txt文件
            fileWriter.write("H");//将H写入note.txt文件中
            fileWriter.write("你好，长沙");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
