package strategyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 10:45
 * @Description 第二章： 策略模式的学习
 *                          超市的收银模式
 *
 *      策略模式和简单工厂模式比较：
 *          1. 都是通过多态来实现不同子类的选取，这种思想应该是从程序的整体来看得出的。
 *          2. 简单工厂模式中只需要传递相应的条件就能得到想要的一个对象，然后通过这个对象实现算法的操作。
 *             策略模式，使用时必须首先创建一个想使用的类对象，然后将该对象作为参数传递进去，通过该对象调用不同的算法。
 *          3. 在简单工厂模式中实现了通过条件选取一个类去实例化对象，
 *             策略模式则将选取相应对象的工作交给模式的使用者，它本身不去做选取工作。
 *
 *
 **/
public class CashProgram {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext("return300By100");
        Double payMoney = cashContext.getResult(700.0);
        System.out.println("应支付金额： " + payMoney);
    }

}
