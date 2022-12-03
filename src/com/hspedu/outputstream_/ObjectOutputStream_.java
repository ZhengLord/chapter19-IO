package com.hspedu.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是纯文本，而是按照它的格式来保存
        String filePath="d:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("一蓑烟雨任平生");
        oos.writeObject(new Dog("大黄",8));//此处应该实现接口
        oos.close();
        System.out.println("数据保存完毕");
    }
}
