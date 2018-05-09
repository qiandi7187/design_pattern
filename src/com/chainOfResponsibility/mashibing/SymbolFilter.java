package com.chainOfResponsibility.mashibing;

/**
 * 过滤敏感字
 */
public class SymbolFilter implements StringFilter{


    @Override
    public String doFilter(String str) {
        System.out.println("符号过滤："+str);
        return  str.replaceAll("<","《").replaceAll(">","》");
    }
    
}
