package com.test.StringTest;

import lombok.Data;

public class A {

     int i = 100;

     String b = "B";

     String c = new String("C");

     StringBuffer d = new StringBuffer("D");


    public void change(int i,String b,String c,StringBuffer d){
        i++;
        b = "S";
        c = "S";
        d.append("s");
    }

    public static void changeStr(String s){
        s += "S";
    }

    public static void main(String[]args){
        A a = new A();
        System.out.println(a.i+"   "+ a.b+"    "+a.c +"    "+a.d);
        a.change(a.i,a.b,a.c,a.d);
        System.out.println(a.i+"   "+ a.b+"    "+a.c +"    "+a.d);


        String s = "123";
        String s2 = "123";
        System.out.println(s==s2);
        String s3 = new String("123");

        System.out.println(s==s3);

        changeStr(s3);
        System.out.println(s3);

    }

}
