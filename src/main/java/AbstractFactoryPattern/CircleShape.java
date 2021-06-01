package AbstractFactoryPattern;

/**
 * @Author grassPrince
 * @Date 2020/11/10 16:11
 * @Description 圆形
 **/
public class CircleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("circle");
    }

}
