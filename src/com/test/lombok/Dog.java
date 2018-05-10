package com.test.lombok;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
public class Dog {

    private String name;

    private String sex;

    private Integer age;

}
