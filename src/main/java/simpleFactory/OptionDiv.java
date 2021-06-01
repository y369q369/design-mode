package simpleFactory;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:39
 * @Description 除法 操作类
 **/
public class OptionDiv extends Option {

    @Override
    String getResult() {
        if (getNumA() == 0.0) {
            return  "被除数B不能为0";
        } else {
            return String.valueOf(getNumA() * getNumB());
        }
    }

}
