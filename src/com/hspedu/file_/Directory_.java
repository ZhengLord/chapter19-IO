package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath="d:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if (file.delete()){
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }
    }
    //在Java中目录也被当作文件来处理
    @Test
    public void m2(){
        String filePath="d:\\demo";
        File file = new File(filePath);
        if(file.exists()){
            if (file.delete()){
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("该目录不存在");
        }
    }
    @Test
    public void m3(){
        String directoryPath="d:\\demo\\a\\b\\c";
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
    }
}
