package statePattern.pattern;

import java.math.BigDecimal;

/**
 * @Author grassPrince
 * @Date 2020/11/11 10:55
 * @Description 动漫
 **/
public class AnimationMovie extends AbstractMovie {

    public AnimationMovie(Integer num) {
        super(num);
        super.unitPrice = BigDecimal.valueOf(30.0);
    }

}
