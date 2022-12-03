package com.hspedu.standard;

public class InputAndOutput {
    public static void main(String[] args) {
        //System.in 的编译类型InputStream
        //System.in 的运行类型BufferedInputStream
        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());
    }
}
