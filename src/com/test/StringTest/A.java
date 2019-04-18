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

        Integer i = 0;
        ChangeA(i);
        System.out.println(i);


        Long l1 = new Long(1234567890);
        Long l2 = new Long(1234567890);
        System.out.println(l1 == l2);

        System.out.println(l1.equals(l2));

        System.out.println(l1.longValue()==l2.longValue());

        Long l3 = new Long(100);
        Long l4 = new Long(100);
        System.out.println(l3 == l4);

        System.out.println(l3.equals(l4));

        System.out.println(l3.longValue()==l4.longValue());


        System.out.println();
    }

    private static void ChangeA(Integer i){i++;}

}
