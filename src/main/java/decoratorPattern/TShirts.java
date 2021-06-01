package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 11:45
 * @Description 具体服饰类： T恤
 **/
public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}
