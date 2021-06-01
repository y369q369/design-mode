package simpleFactory;

import lombok.Data;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:21
 * @Description 操作类的抽象类
 **/
@Data
public abstract class Option {

    private Double numA = 0.0;
    private Double numB = 0.0;

    abstract String getResult();
}
