package com.proxy.mashibing.cglibDynamicProxy;

/**
 * CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，
 * 顺势织入横切逻辑。JDK动态代理与CGLib动态代理均是实现Spring AOP的基础。
 * 记录日志
 *
 * 基于CGLib采实现的动态代理无须实现接口
 */
public class Client {

    public static void main(String[] args) {
        Plane proxy = (Plane)new LogProxy().getProxy(Plane.class);
        proxy.move();
        System.out.println("------------------");
        proxy.stop();
    }
}
