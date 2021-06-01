package statePattern.pattern;

import java.math.BigDecimal;

/**
 * @Author grassPrince
 * @Date 2020/11/11 10:31
 * @Description 悬疑类电影
 **/
public class SuspenseMovie extends AbstractMovie {

    public SuspenseMovie(Integer num) {
        super(num);
        super.unitPrice = BigDecimal.valueOf(10.0);
    }

}
