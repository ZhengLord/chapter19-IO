package com.hspedu.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath="d:\\story.txt";
        String destFilePath="d:\\a2.txt";
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        String line;
        try {
             bufferedReader = new BufferedReader(new FileReader(srcFilePath));
             bufferedWriter=new BufferedWriter(new FileWriter(destFilePath));
             while ((line=bufferedReader.readLine())!=null){
                 bufferedWriter.write(line);
                 bufferedWriter.newLine();
             }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
