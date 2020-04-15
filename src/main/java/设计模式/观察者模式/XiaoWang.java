package 设计模式.观察者模式;

public class XiaoWang implements Person {
    @Override
    public void getMessage(String msg) {
        System.out.println("小王接收到消息: " + msg);
    }
}
