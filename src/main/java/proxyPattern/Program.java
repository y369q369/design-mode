package proxyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/29 9:25
 * @Description 第七章： 代理模式的学习
 *                       代理追求者送礼物给mm
 **/
public class Program {

    public static void main(String[] args) {
        Proxy proxy = new Proxy("校花");
        proxy.GiveChocolate();
        proxy.GiveFlowers();
    }

}
