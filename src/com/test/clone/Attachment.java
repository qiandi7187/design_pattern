package com.test.clone;

import lombok.Data;

@Data
public class Attachment implements Cloneable{
    private String name;

    public Attachment(String name) {
        this.name = name;
    }

    public void dowmload(){
        System.out.println("下载附件："+name);
    }

    @Override
    public Attachment clone()   {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
