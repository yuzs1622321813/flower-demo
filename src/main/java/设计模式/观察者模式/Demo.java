package 设计模式.观察者模式;

public class Demo {
    public static void main(String[] args) {
        XiaoMei m = new XiaoMei();
        XiaoLi l = new XiaoLi();
        XiaoWang w = new XiaoWang();
        m.addLookPerson(w);
        m.addLookPerson(l);
        m.sendMessage();
    }
}
