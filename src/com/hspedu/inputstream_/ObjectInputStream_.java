package com.hspedu.inputstream_;

import com.hspedu.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath="d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
//        System.out.println(ois.readObject());
        Object o = ois.readObject();
        System.out.println("运行内存="+o.getClass());
        System.out.println("dog信息="+o);
        ois.close();
//        Dog dog=(Dog)o;

    }
}
