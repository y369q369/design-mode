package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author grassPrince
 * @Date 2020/11/6 16:02
 * @Description 坏人嫌疑犯抽象类
 **/
public abstract class Buddy {

    protected List<Observer> observerList = new ArrayList<Observer>();

    // 添加便衣观察者
    void addObserver (Observer observer) {
        observerList.add(observer);
    };

    // 删除便衣观察者
    void deleteObserver (Observer observer) {
        observerList.remove(observer);
    };

    // 通知观察者
    void notice(String message, String name) {
        for (Observer observer: observerList) {
            observer.update(message, name);
        }
    };


}
