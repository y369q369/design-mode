package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 11:48
 * @Description 具体服饰类： 垮裤
 **/
public class BigTrouser extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤！");
    }
}
