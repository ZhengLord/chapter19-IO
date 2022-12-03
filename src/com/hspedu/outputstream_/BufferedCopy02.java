package com.hspedu.outputstream_;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String scrFilePath="d:\\Account.png";
        String destFilePath="d:\\UML.png";
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            bis=new BufferedInputStream(new FileInputStream(scrFilePath));
            bos=new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[] buff=new byte[1024];
            int readLen=0;
            while ((readLen= bis.read(buff))!=-1){
                bos.write(buff,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bis!=null){
                    bis.close();
                }
                if (bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
