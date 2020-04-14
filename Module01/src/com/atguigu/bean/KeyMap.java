package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.ArrayList;

/**
 * 快捷键：
 *
 * 查看继承关系：F4
 * 查找文件：shift+shift
 * 查看类结构：ctrl+o
 *
 * 重构：修改变量名，方法名 alt+shift+r
 * 折叠所有方法：alt+shift+c
 * 打开所有方法：alt+shift+x
 * 生成try-catch：alt+shift+z
 * 局部变量变为全局变量：alt+shift+f
 * 抽取代码生成新的方法：alt+shift+m
 *
 * 查看方法的参数信息：ctrl+alt+/
 * 添加到收藏夹：ctrl+alt+f
 *
 * 打开当前文件所在位置：ctrl+shift+x
 * 查看继承结构树：ctrl+shift+u
 * 查看错误：ctrl+shift+q
 * 粘贴板：ctrl+shift+v
 * 查看方法在哪里被调用：ctrl+shift+h
 *
 * 打印：sout,soutf,soutm,soutp,soutv,xxx.sout
 * for：fori,itar
 * foreach：iter
 * list遍历：list.for  -- 变形1：list.fori, 变形2(逆序遍历)：list.forr
 * if：ifn, inn, xx.null, xx.nn
 * private static final: prsf
 * public static final: psf
 * public static final int: psfi
 * public static final String: psfs
 *
 */
public class KeyMap {
    public static final int a = 1;
    public static final String b = "123";
    private static int i = 1;

    public static void main(String[] args) {
        String c = "1";


        System.out.println("Module...");
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add(0, "123");
        method1();
    }

    public static void method1() {
        i = 1;
        try {
            FileInputStream fileInputStream = new FileInputStream("111.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    

}
