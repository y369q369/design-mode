package strategyPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 10:24
 * @Description 策略模式与简单工厂结合
 **/
public class CashContext {

    private CashSuper cs;

    public CashContext(String type) {

        switch (type) {
            case "normal":
                cs = new CashNormal();
                break;
            case "rebateBy8":
                // 打八折
                cs = new CashRebate(0.8);
                break;
            case "return300By100":
                // 满300返100
                cs = new CashReturn(300.0, 100.0);
                break;
        }
    }

    public Double getResult (Double money) {
        return cs.acceptCash(money);
    }

}
