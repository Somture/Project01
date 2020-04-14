package com.atguigu.bean;

import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Somture
 * @create 2020-04-14 11:04
 */
public class TemplatesTest {

    private static List list;
    //psfi
    public static final int a = 0;
    //psf
    public static final String b = "";


    public static void main(String[] args) {
//        For();
//        List_for();
//        If(args);

        //prsf
    }

    /**
     * if
     * @param args
     */
    private static void If(String[] args) {
        //ifn
        if (args == null) {

        }
        //inn
        if (args != null) {

        }
        //xx.null
        if (list == null) {

        }
        //xx.nn
        if (list != null) {

        }
    }

    /**
     * for循环
     */
    private static void For() {
        String[] arr = new String[]{"1","2","3","4"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.printf(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
    }

    /**
     *  List 遍历
     */
    private static void List_for() {
        //list.for
        list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            //这是逆序遍历
        }
    }


}

