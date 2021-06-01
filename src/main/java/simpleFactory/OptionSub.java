package simpleFactory;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:37
 * @Description 减法 操作类
 **/
public class OptionSub extends Option{

    @Override
    String getResult() {
        return String.valueOf(getNumA() - getNumB());
    }

}
