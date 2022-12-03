package com.hspedu.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

public class FileReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath="d:\\story.txt";
        FileReader fileReader=null;
        int data=0;
        try {
            fileReader=new FileReader(filePath);
            while((data=fileReader.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile02(){
        String filePath="d:\\story.txt";
        FileReader fileReader=null;
        char[] buf=new char[8];
        int readLen=0;
        try {
            fileReader=new FileReader(filePath);
            while((readLen=fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
