package com.hspedu.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directoryPath="d:\\mytemp";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println("该目录已存在");
        }else {
            if(file.mkdirs()){
                System.out.println(directoryPath+"创建成功");
            }else {
                System.out.println(directoryPath+"创建失败");
            }
        }
        String filePath =directoryPath+"\\hello1.txt";
        file=new File(filePath);
        if (!file.exists()){
            if (file.createNewFile()){
                System.out.println(filePath+"创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello world");
                bufferedWriter.close();
            }else {
                System.out.println(filePath+"创建失败");
            }
        }
    }
}
