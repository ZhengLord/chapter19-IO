package com.hspedu.outputstream_;

import org.junit.jupiter.api.Test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath="d:\\b.txt";
        //new FileOutputStream(filePath);该方式创建是覆盖原内容
        //new FileOutputStream(filePath,true);该方式为在原内容上追加
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
//            fileOutputStream.write(49);
            String str="hello world";
            //str.getBytes()函数可以将字符串转化为byte数组
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
