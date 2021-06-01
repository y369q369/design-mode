package factoryMethod;

/**
 * @Author grassPrince
 * @Date 2020/10/29 10:08
 * @Description 学雷锋的大学生工厂
 **/
public class UnderGraduateFactory implements IFactory {

    @Override
    public LeiFeng CreateLeiFeng() {
        return new UnderGraduate();
    }

}
