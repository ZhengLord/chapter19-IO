package com.hspedu.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String filePath="d:\\Account.png";
        String destFilePath="d:\\Account_.png";
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream= new FileInputStream(filePath);
            fileOutputStream=new FileOutputStream(destFilePath);
            byte[] buf=new byte[1024];
            int readLen=0;
            while((readLen=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
