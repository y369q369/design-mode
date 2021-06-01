package proxyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/29 9:19
 * @Description 追求者类
 **/
public class Pursuit implements GiveGift {

    String mm = "";

    public Pursuit(String mm) {
        this.mm = mm;
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送花 给 " + mm);
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送巧克力 给 " + mm);
    }

}
