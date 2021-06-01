package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:29
 * @Description 第十五章： 抽象工厂模式的学习
 *  *                         颜色和图形工厂上再加一个超级抽象工厂
 **/
public class Program {

    public static void main(String[] args) {
        Shape shape = FactoryProducer.getShapeFactory().getShape("rectangle");
        shape.draw();

        Color color = FactoryProducer.getColorFactory().getColor("black");
        color.fill();
    }

}
