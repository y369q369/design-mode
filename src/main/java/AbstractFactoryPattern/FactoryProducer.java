package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:31
 * @Description 生成工厂
 **/
public class FactoryProducer {

    public static AbstractFactory getShapeFactory() {
        return new ShapeFactory();
    }

    public static AbstractFactory getColorFactory() {
        return new ColorFactory();
    }

}
