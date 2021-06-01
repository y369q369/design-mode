package ObserverPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/6 16:19
 * @Description 第十四章： 观察者模式
 *                        便衣警察发现坏人，集体通知
 **/
public class Program {

    public static void main(String[] args) {
        Suspicion1 suspicion1 = new Suspicion1();
        suspicion1.addObserver(new PoliceObserver1());
        suspicion1.addObserver(new PoliceObserver2());
        suspicion1.notice("封闭现场", suspicion1.name);

        Suspicion2 suspicion2 = new Suspicion2();
        suspicion2.addObserver(new PoliceObserver2());
        suspicion2.addObserver(new PoliceObserver3());
        suspicion2.notice("立即抓捕", suspicion2.name);

    }

}
