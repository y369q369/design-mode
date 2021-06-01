package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:26
 * @Description 图形工厂
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        switch (color) {
            case "red":
                return new RedColor();
            case "orange":
                return new OrangeColor();
            case "black":
                return new BlackColor();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
