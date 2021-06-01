package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:13
 * @Description 矩形
 **/
public class RectangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }

}
