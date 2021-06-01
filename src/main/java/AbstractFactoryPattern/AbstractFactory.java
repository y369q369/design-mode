package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:19
 * @Description TODO
 **/
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}
