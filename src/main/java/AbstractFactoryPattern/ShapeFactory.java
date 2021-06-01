package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:22
 * @Description 图形工厂
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        switch (shape) {
            case "circle":
                return new CircleShape();
            case "rectangle":
                return new RectangleShape();
            case "square":
                return new SquareShape();
        }
        return null;
    }

}
