package com.hspedu.printStream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out=System.out;
        out.println("hello");
        //因为print底层使用的是write，所以可以直接调用write进行打印
        out.write("中国，你好".getBytes());
        out.close();
        //我们也可以改变打印的位置
        System.setOut(new PrintStream("d:\\f1.txt"));
        System.out.println("hello,changsha");//此后打印的内容会打印入上面的那个文件内
    }
}
