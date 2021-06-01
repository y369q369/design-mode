package ObserverPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/6 15:09
 * @Description 便衣警察观察者1
 **/
public class PoliceObserver1 implements Observer {

    @Override
    public void update(String message, String name) {
        System.out.println("便衣1： " + name + "有新情况：" + message);
    }

}
