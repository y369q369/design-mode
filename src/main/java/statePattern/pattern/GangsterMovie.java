package statePattern.pattern;

import java.math.BigDecimal;

/**
 * @Author grassPrince
 * @Date 2020/11/11 10:54
 * @Description 警匪片
 **/
public class GangsterMovie extends AbstractMovie {

    public GangsterMovie(Integer num) {
        super(num);
        super.unitPrice = BigDecimal.valueOf(20.0);
    }

}
