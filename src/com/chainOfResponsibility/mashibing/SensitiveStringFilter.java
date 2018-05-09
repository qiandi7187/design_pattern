package com.chainOfResponsibility.mashibing;

/**
 * 过滤敏感字
 */
public class SensitiveStringFilter implements StringFilter{

    @Override
    public String doFilter(String str) {
        System.out.println("敏感字过滤："+str);
        return  str.replaceAll("牛逼","**");
    }

}
