package strategyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 10:26
 * @Description 正常收费子类
 **/
public class CashNormal extends CashSuper {

    @Override
    Double acceptCash(Double money) {
        return money;
    }

}
