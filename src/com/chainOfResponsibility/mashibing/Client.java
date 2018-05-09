package com.chainOfResponsibility.mashibing;

public class Client {

    public static void main(String[] args) {
        String s = "<script>你好牛逼哈";

        StringFilterChain chain  = new StringFilterChain();
        chain.addFilter(new SensitiveStringFilter());
        chain.addFilter(new SymbolFilter());
        System.out.println("结果"+chain.doFilter(s));
        System.out.println("chain实现了Filter接口后也可以加入list");
        StringFilterChain chain2  = new StringFilterChain();
        chain2.addFilter(new SensitiveStringFilter());
        chain2.addFilter(chain);
        System.out.println("结果"+chain.doFilter(s));
    }

}
