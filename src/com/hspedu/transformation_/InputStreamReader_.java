package com.hspedu.transformation_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
       String filePath="d:\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("内容="+s);
        br.close();
    }
}
