package com.hspedu.inputstream_;


import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath="d:\\hello.txt";
        int readContent=0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //read()函数的作用从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
            while ((readContent=fileInputStream.read())!=-1){
                System.out.print((char)readContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile02(){
        String filePath="d:\\hello.txt";
        int readLen=0;
        byte[] buf=new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //read()函数的作用从该输入流读取buf.length个字节的数据，如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
            while ((readLen=fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
