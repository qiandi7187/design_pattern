package com.decorator.javaAndPattern.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Bonus {

    private Integer uid;

    private Integer bid;

    private Integer discount;
    
}
