package com.tcx.java;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author tucx
 * @create 2020-08-22 19:02
 */
public class Bean {


    public Bean() {
    }

    /* 多行注释 */
    public static void main(String[] args) {
        System.out.println("hello world!!!");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0, "a");

        Date date = new Date();

    }

    // 单行注释
    public static void test() {
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
