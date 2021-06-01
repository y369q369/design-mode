package proxyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/29 9:21
 * @Description 代理追求者类
 **/
public class Proxy implements GiveGift {

    private Pursuit pursuit = null;

    public Proxy(String mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }
}
