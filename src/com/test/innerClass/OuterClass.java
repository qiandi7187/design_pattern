package com.test.innerClass;

public class OuterClass {

    private static String ss = "静态成员变量能被静态内部类调用，而普通成员变量则不能";
    private String s1 = "成员变量能被成员内部类调用";

    protected String s2;

    private StaticInnerClass[] staticInnerClass;

    private MemberInnerClass[] memberInnerClass;

    public static class StaticInnerClass {
        private String innerStr1;

        public String innerStr2;

        public OuterClass outerClass;

        public static void test(){
            System.out.println(ss+"");
        }

    }

    public  class MemberInnerClass {
        private String innerStr1;

        public String innerStr2;

        public OuterClass outerClass;

        public void test(){
            System.out.println(s1+"");
        }

    }

}
