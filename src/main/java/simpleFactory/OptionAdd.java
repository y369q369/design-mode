package simpleFactory;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:35
 * @Description 加法 操作类
 **/
public class OptionAdd extends Option {

    @Override
    String getResult() {
        return String.valueOf(getNumA() + getNumB());
    }
}
