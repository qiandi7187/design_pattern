package com.test.innerClass;

public class InnerClassTest {

    public static void main(String[] args) {
        OuterClass.StaticInnerClass.test();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

        OuterClass.MemberInnerClass memberInnerClass = new OuterClass().new MemberInnerClass();

        memberInnerClass.test();
    }

}
