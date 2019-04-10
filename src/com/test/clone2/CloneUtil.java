package com.test.clone2;

import java.io.*;

public class CloneUtil {

    public static Object deepClone(Object obj){
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(bao);
            oos.writeObject(obj);


        } catch (IOException e) {
            e.printStackTrace();
        }
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }


}
