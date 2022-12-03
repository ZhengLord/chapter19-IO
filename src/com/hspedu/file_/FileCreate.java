package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String filePath="d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create02(){
        File file = new File("d:\\");
        String fileName="news2.txt";
        File file1 = new File(file, fileName);
        try {
            file1.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String parentPath="d:\\";
        String fileName="news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
