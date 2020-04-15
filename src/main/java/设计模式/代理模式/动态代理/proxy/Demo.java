package 设计模式.代理模式.动态代理.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        InvocationHandler s = new SubjectProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(s.getClass().getClassLoader(), subject.getClass().getInterfaces(), s);
        proxyInstance.hello("world");
        subject.hello("wor");
    }

}