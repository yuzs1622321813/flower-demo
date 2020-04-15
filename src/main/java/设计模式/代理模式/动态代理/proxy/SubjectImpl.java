package 设计模式.代理模式.动态代理.proxy;

public class SubjectImpl implements Subject {
    @Override
    public void hello(String param) {
        System.out.println("hello  " + param);
    }

    @Override
    public void byby(String param) {
        System.out.println("byby  " + param);
    }
}