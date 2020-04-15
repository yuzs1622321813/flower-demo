package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class XiaoMei {
    List<Person> lookList = new ArrayList();

    public void addLookPerson(Person p) {
        lookList.add(p);
    }

    public void sendMessage() {
        for(Person p : lookList) {
            p.getMessage("来嘛");
        }
    }

}
