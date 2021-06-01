package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:18
 * @Description 黑色
 **/
public class BlackColor implements Color {

    @Override
    public void fill() {
        System.out.println("黑色");
    }
}
