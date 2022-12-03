package com.hspedu.homework;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) {
        String filePath="d:\\story.txt";
        InputStreamReader isr=null;
        BufferedReader br=null;
        String line="";
        int lineNum=0;
        try {
            isr=new InputStreamReader(new FileInputStream(filePath),"gbk");
            br=new BufferedReader(isr);
            while((line= br.readLine())!=null){
                System.out.println(++lineNum+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
