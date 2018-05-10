package com.test.lombok;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Cat {

    private String name;

    private String sex;

    private Integer age;

}
