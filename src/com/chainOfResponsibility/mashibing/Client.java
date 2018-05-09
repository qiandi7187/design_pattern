package com.chainOfResponsibility.mashibing;

/**
 * 实现马士兵设计模式教学中的责任链
 * 实现采用list逐一调用的方式  该方式教击鼓传花的例子更好 耦合度进一步降低
 */
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
