package 设计模式.代理模式.动态代理.cglib;

public class Dog{
    
    final public void run(String name) {
        System.out.println("狗"+name+"----run");
    }

    public static void ee() {
        System.out.println("ee");
    }
    public void eea() {
        System.out.println("eea");
    }

    public void eat() {
        System.out.println("狗----eat!!!");
    }
}