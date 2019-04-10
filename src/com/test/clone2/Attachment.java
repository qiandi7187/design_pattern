package com.test.clone2;

import lombok.Data;

import java.io.Serializable;

@Data
public class Attachment implements Serializable {
    private String name;

    public Attachment(String name) {
        this.name = name;
    }

    public void dowmload(){
        System.out.println("下载附件："+name);
    }


}
