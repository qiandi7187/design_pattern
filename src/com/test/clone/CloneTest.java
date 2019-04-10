package com.test.clone;

import com.alibaba.fastjson.JSON;
import com.test.enumTest.MySimpleColorEnum;
import com.test.enumTest.MyTimeUnit;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSObject;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;

public class CloneTest {

    public static void main(String[] args) {

        CloneObject obj1 = new CloneObject();
        obj1.setContent("内容1");
        //clone方法为protect 不能直接调用
       // obj1.clone();
        CloneObject obj2 =  null;
        obj2 = obj1.clone();
        System.out.println("clone对象两者是否是同一对象："+(obj1==obj2));
        System.out.println(obj1.getContent());
        System.out.println(obj2.getContent());
        System.out.println("修改后不影响clone对象");
        obj1.setContent("内容2");
        System.out.println(obj1.getContent());
        System.out.println(obj2.getContent());


        //采用Spring工具类复制对象
        /* System.out.println("采用Spring工具类复制对象");
        CloneObject obj3 = new CloneObject();
        BeanUtils.copyProperties(obj1,obj3);
        System.out.println(obj3.getContent());


        //测试Spring 工具类
       System.out.println("测试Spring 工具类");
        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(CloneObject.class);
        for(PropertyDescriptor pd : pds){
            System.out.println(pd.getWriteMethod());
            System.out.println(pd.getName());
        }*/


    }
}
