package factoryMethod;

/**
 * @Author grassPrince
 * @Date 2020/10/29 10:09
 * @Description 学雷锋志愿者工厂
 **/
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng CreateLeiFeng() {
        return new LeiFeng();
    }

}
