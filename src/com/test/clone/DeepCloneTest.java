package com.test.clone;

public class DeepCloneTest {

    public static void main(String[] args) {

        CloneObject obj1 = new CloneObject();
        obj1.setContent("内容1");
        obj1.setAttachment(new Attachment("附件1"));
        CloneObject obj2 = obj1.deepClone();
        System.out.println("测试接口深复制，是否指向同一个对象："+( obj2.getAttachment()==obj1.getAttachment()));
        obj1.getAttachment().setName("附件2");
        System.out.println("测试接口深复制，被复制对象的引用的对象改变，复制对象不发生改变，原型："+obj1.getAttachment().getName()+"   克隆："+obj2.getAttachment().getName());

    }
}
