package strategyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 10:27
 * @Description 打折收费子类
 **/
public class CashRebate extends CashSuper {

    private Double moneyRebate = 1d;

    public CashRebate(Double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    Double acceptCash(Double money) {
        return money * money;
    }

}
