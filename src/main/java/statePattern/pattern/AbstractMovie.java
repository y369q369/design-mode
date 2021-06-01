package statePattern.pattern;

import java.math.BigDecimal;

/**
 * @Author grassPrince
 * @Date 2020/11/11 10:29
 * @Description 电影抽象类
 **/
public abstract class AbstractMovie {

    Integer num;

    BigDecimal unitPrice;

    public AbstractMovie(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return unitPrice.multiply(getDiscount()).setScale(2, BigDecimal.ROUND_HALF_UP);
    };

    // 获取折扣
    public BigDecimal getDiscount() {
        if (num == 1) {
            return BigDecimal.valueOf(0.9);
        } else if (num == 2) {
            return BigDecimal.valueOf(0.8).multiply(new BigDecimal(2));
        } else {
            return BigDecimal.valueOf(0.75).multiply(new BigDecimal(num));
        }
    }

}
