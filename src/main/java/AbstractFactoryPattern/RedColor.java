package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:16
 * @Description 红色
 **/
public class RedColor implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }

}
