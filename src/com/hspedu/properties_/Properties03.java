package com.hspedu.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","123456");
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
    }
}
