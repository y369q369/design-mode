package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 15:14
 * @Description 具体服饰类： 西装
 **/
public class Suit extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.println("外套");
    }

}
