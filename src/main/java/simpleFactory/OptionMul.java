package simpleFactory;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:38
 * @Description 乘法 操作类
 **/
public class OptionMul extends Option {

    @Override
    String getResult() {
        return String.valueOf(getNumA() * getNumB());
    }

}
