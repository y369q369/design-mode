package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:12
 * @Description 方形
 **/
public class SquareShape implements Shape {

    @Override
    public void draw() {
        System.out.println("square");
    }

}
