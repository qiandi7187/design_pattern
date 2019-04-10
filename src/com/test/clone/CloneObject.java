package com.test.clone;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
public class CloneObject implements Cloneable {


    private String content;

    private Attachment attachment;

    @Override
    public CloneObject clone()   {
        try {
            return (CloneObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CloneObject deepClone()   {
        CloneObject cloneObject = null;
        try {
            cloneObject =  (CloneObject) super.clone();
            cloneObject.setAttachment(attachment.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObject;
    }

}
