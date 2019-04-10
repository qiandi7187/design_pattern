package com.test.clone;

import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;

public class ShallowCloneTest {

    public static void main(String[] args) {

        CloneObject obj1 = new CloneObject();
        obj1.setContent("内容1");
        obj1.setAttachment(new Attachment("附件1"));
        CloneObject obj2 = obj1.clone();
        System.out.println("测试浅复制，指向同一个对象："+( obj2.getAttachment()==obj1.getAttachment()));
        obj1.getAttachment().setName("附件2");
        System.out.println("测试浅复制，被复制对象的引用的对象改变，复制对象也同样改变，原型："+obj1.getAttachment().getName()+"   克隆："+obj2.getAttachment().getName());
        obj1.setAttachment(new Attachment("附件3"));
        System.out.println("测试浅复制，有意思的是被复制对象的引用改变，复制对象还会指向原来的引用，所以不会改变，原型："+obj1.getAttachment().getName()+"  克隆： "+obj2.getAttachment().getName());


    }
}
