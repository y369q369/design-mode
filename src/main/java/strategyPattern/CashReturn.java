package strategyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 10:29
 * @Description 返利收费子类
 **/
public class CashReturn extends CashSuper {

    // 返利的限制金额， 如： 满300返100， 即300
    private Double moneyCondition = 0.0d;

    // 返利的金额， 如： 满300返100， 即100
    private Double moneyReturn = 0.0d;

    public CashReturn(Double moneyCondition, Double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    Double acceptCash(Double money) {
        return money - moneyReturn * Math.floor((money / moneyCondition));
    }

}
