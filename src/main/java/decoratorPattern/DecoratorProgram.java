package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 11:36
 * @Description 第六章： 装饰模式的学习
 *  *                       换衣服
 **/
public class DecoratorProgram {

    public static void main(String[] args) {

        Person xc = new Person("小菜");
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorate(xc);
        Suit suit = new Suit();
        suit.decorate(bigTrouser);
        TShirts tShirts = new TShirts();
        tShirts.decorate(suit);
        // 多个子类多次调用的时候，只在第一次执行super.show()方法
        tShirts.show();
    }

}
